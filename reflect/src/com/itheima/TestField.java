package com.itheima;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestField {

    @Test
    public void test() throws Exception {
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName()+":"+f.getType());
        }

        Field fAge = c.getDeclaredField("age");
        Field fName = c.getDeclaredField("name");
        System.out.println(fAge.getName()+":"+fAge.getType());
        System.out.println(fName.getName()+":"+fName.getType());

        // 赋值
        Student s = new Student();
        fName.setAccessible(true);
        fName.set(s,"liu");
        System.out.println(s);

        // 取值
        String name = (String) fName.get(s);
        System.out.println(name);
    }

}
