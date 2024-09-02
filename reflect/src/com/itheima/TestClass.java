package com.itheima;

public class TestClass {

    public static void main(String[] args) throws ClassNotFoundException {

        // 获取字节码对象的三种方法

        Class c1   = Student.class;
        System.out.println(c1.getSimpleName()); // 类名
        System.out.println(c1.getName()); // 获取全类名

        Class c2 = Class.forName("com.itheima.Student");
        System.out.println(c1 == c2);

        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c1 == c3);

    }

}
