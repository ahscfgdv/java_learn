package com.itheima.loop;

import java.util.Scanner;

public class LoopDemo {
    /*
        循环语句可以解决的问题 : 将一段代码逻辑, 重复的执行很多次
     */
    public static void main(String[] args) {
        checkPassword();
    }

    public static void checkPassword() {

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.println("请输入密码:");
            int password = sc.nextInt();
            if (password == 123456) {
                System.out.println("密码正确");
            } else {
                System.out.println("密码错误");
            }
        }



    }
}
