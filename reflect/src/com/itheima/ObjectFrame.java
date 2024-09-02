package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {

    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("D:\\project\\java\\test.txt",true));
        Class c = obj.getClass();
        String className = c.getSimpleName();
        System.out.println("----" + className + "----");
        ps.println("----" + className + "----");

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String value = field.get(obj) + "";
            ps.println(name + "=" + value);
        }
        ps.close();
    }

}
