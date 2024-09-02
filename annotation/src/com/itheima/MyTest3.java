package com.itheima;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD}) // 只能用于类上
@Retention(RetentionPolicy.CLASS  )
public @interface MyTest3 {
    String value() default "";
}
