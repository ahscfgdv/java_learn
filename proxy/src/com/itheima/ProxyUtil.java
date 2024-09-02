package com.itheima;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    public static Star createProxy(BigStar bigStar) {
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("sing")) {
                    System.out.println("准备跳舞收钱20万");
                } else if (method.getName().equals("dance")) {
                    System.out.println("准备场地，收钱20万");
                }
                return method.invoke(bigStar, args);
            }
        });

        return starProxy;
    }


    public static UserService createProxy(UserService userService) {
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{UserService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("login") || method.getName().equals("deleteUser") || method.getName().equals("selectUser")) {
                    long startTime = System.currentTimeMillis();
                    Object rs = method.invoke(userService, args);
                    long endTime = System.currentTimeMillis();
                    System.out.println(method.getName() + "----" + (endTime - startTime) + "ms");
                    return rs;
                } else {
                    return method.invoke(userService, args);
                }
            }
        });

        return userServiceProxy;
    }
}

