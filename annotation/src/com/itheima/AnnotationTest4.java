package com.itheima;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 模拟junit
* 使用自定义注解标记方法
* 获取被标记的方法进行逻辑判断
* */

public class AnnotationTest4 {

    @MyTest
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    @MyTest
    public void test3() {
        System.out.println("test3");
    }

    public void test4() {
        System.out.println("test4");
    }

    public static void main(String[] args) throws Exception {

        AnnotationTest4 a = new AnnotationTest4();

        Class c = AnnotationTest4.class;
        Method[] s = c.getDeclaredMethods();
        for (Method method : s) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.setAccessible(true);
                method.invoke(a);
            }

        }
    }

}
