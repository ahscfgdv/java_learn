package com.itheima;

import org.junit.*;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest3 {

    @Test
    public void parseClass() {
        Class c = Demo.class;
        if (c.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c = Demo.class;
        Method m = c.getDeclaredMethod("test");
        if (m.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 = m.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }

}
