package com.itheima.permissions;

import com.itheima.a.Student;

public class PermissionsDemo {
    /*
        权限修饰符 :

                private : 同一个类中
                (default) : 同一个类中, 同一个包中
                protected : 同一个类中, 同一个包中, 不同包的子类
                                TODO: 继承
                public : 任意位置访问
     */
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 23;
        stu.show();
    }
}
