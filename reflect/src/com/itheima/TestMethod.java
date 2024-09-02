package com.itheima;

import org.junit.Test;

import java.lang.reflect.Method;

public class TestMethod {

    @Test
    public void test() throws Exception {
        Class c = Student.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "----" + method.getParameterCount() + "----" + method.getReturnType());

        }

        // 获取单个方法
        Method read = c.getDeclaredMethod("read");
        System.out.println(read.getName() + "----" + read.getParameterCount() + "----" + read.getReturnType());

        // 获取单个方法
        Method fight = c.getDeclaredMethod("fight", String.class);
        System.out.println(fight.getName() + "----" + fight.getParameterCount() + "----" + fight.getReturnType());

        Student s = new Student();
        Object res = read.invoke(s);
        System.out.println(res);

        fight.setAccessible(true);
        Object liu = fight.invoke(s, "liu");
        System.out.println(liu);
    }

}
