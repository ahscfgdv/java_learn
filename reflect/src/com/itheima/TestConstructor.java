package com.itheima;

import org.junit.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructor {

    @Test
    public void testGetConstructors() {
        Class c = Student.class;
        // 获取public修饰的构造器
//        Constructor[] cs = c.getConstructors();
        // 可以获取不被public修饰的构造器
        Constructor[] cs = c.getConstructors();
        // 获取每个构造器的名字和参数个数
        for (Constructor ctor : cs) {
            System.out.println(ctor.getName() + "----" +
                    ctor.getParameterCount());
        }
    }

    // 通过参数类型获取单个构造方法
    @Test
    public void testGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Student.class;
        // 获取public修饰的构造器
//        Constructor cs = c.getConstructor();
        // 可以获取不被public修饰的构造器
        Constructor cs = c.getConstructor();
        // 获取构造器的名字和参数个数
        System.out.println(cs.getName() + "----" +
                cs.getParameterCount());
        cs.setAccessible(true); // 暴力反射获取无权限的方法
        Student student = (Student) cs.newInstance();
        System.out.println(student);


        Constructor cs2 = c.getConstructor(String.class, int.class, double.class);
        // 获取构造器的名字和参数个数
        System.out.println(cs2.getName() + "----" +
                cs2.getParameterCount());
        Student student1 = (Student) cs2.newInstance("liu",12,1.1);
        System.out.println(student1);
    }
}
