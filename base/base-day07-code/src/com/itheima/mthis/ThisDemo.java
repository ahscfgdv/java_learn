package com.itheima.mthis;

public class ThisDemo {
    /*
        情况: 成员变量和局部变量重名的情况, Java使用的是就近原则

        问题: 非要使用成员变量, 怎么办?
        解决: 使用this关键字进行区分

                this可以区分局部变量和成员变量的重名问题
        ---------------------------------------------------

        this关键字的作用:

                this可以调用本类成员 (变量, 方法)

                    this.本类成员变量
                    this.本类成员方法();

                this.的省略规则 :

                    本类成员方法 : 没有前提条件, this.可以直接省略
                    本类成员变量 : 方法中没有出现重名的变量, this.才可以省略


        ---------------------------------------------------

        this介绍 : 代表当前类对象的引用(地址)
                        - 谁来调用我, 我就代表谁.

                        - 哪一个对象调用方法, 方法中的this, 代表的就是哪一个对象.

                        stu1.print() ----> this ---> stu1的地址
                        stu2.print() ----> this ---> stu2的地址

     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1);
        stu1.print();

        Student stu2 = new Student();
        System.out.println(stu2);
        stu2.print();
    }
}
