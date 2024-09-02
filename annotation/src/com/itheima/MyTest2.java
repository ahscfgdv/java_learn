package com.itheima;



public @interface MyTest2 {
    String value();
    int age() default 1;
}
