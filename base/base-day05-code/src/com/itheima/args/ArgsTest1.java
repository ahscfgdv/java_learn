package com.itheima.args;

/**
 * 在Java中，方法参数传递机制是“按值传递”（pass by value）。
 * 这意味着当你传递一个基本数据类型（如int）到方法中时，传递的是该值的一个拷贝，而不是原始变量本身。因此，对拷贝的修改不会影响原始变量。
 */

public class ArgsTest1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);        // 100
        change(number);
        System.out.println("调用change方法后:" + number);        // 100
    }

    public static void change(int number) {
        number = 200;
    }
}
