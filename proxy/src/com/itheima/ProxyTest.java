package com.itheima;


import org.junit.Test;

public class ProxyTest {

    UserService userService = ProxyUtil.createProxy(new UserServiceImpl());


    @Test
    public void tset1() {
        BigStar s = new BigStar("杨超越");
        Star starProxy = ProxyUtil.createProxy(s);
        String rs = starProxy.sing("hao");
        System.out.println(rs);
        starProxy.dance();
    }

    @Test
    public void test() throws Exception {
        userService.login("admin","123456");
        System.out.println("---");
        userService.deleteUser();
        System.out.println("---");
        userService.selectUser();
        System.out.println("---");

    }

}
