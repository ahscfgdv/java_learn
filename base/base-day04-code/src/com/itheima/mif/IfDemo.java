package com.itheima.mif;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        ifTest1();
    }

    /*
        if语句的第一种格式:

            if(判断条件){
                语句体;
            }

        执行流程:
            1. 执行判断条件, 看其返回结果是true, false
            2. true : 执行 {} 中的语句体
            3. false : 不执行 {} 中的语句体
     */
    public static void ifTest1(){
        System.out.println("开始");

        int age = 17;

        if(age >= 18) {
            System.out.println("可以上网吧!");
        }

        System.out.println("结束");
    }

    /*
        if语句的第二种格式 :

            if (判断条件) {
                语句体1;
            } else {
                语句体2;
            }

        执行流程:

            1. 执行判断条件看其返回结果是true, false
            2. true : 执行语句体1
            3. false : 执行语句体2
     */
    public static void ifTest2(){

        System.out.println("开始");

        int age = 17;

        if(age >= 18){
            System.out.println("可以上网吧");
        } else {
            System.out.println("您的年龄未满18岁, 不可以上网吧!");
        }

        System.out.println("结束");

    }

    /*
        if语句的第三种格式 :

            if(判断条件1){
                语句体1;
            }else if (判断条件2) {
                语句体2;
            }else if (判断条件3){
                语句体3;
            }
            ...
            else {
                语句体n+1;
            }

        执行流程:

            1. 执行判断条件1, 看其返回结果是true, false
                    true : 执行语句体1, 执行完毕后, 结束整个if语句.
                    false : 执行第二步
            2. 执行判断条件2, 看其返回结果是true, false
                    true : 执行语句体2, 执行完毕后, 结束整个if语句.
                    false : 执行第三步
                ...
            3. 如果给出的所有条件, 都不成立, 将会执行最后的 else
     */
    public static void ifTest3(){
        // 需求: 键盘录入一个整数数值, 表示用户身份   1. 会员   2. 非会员  其他. 您的输入有误
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("会员身份");
        }else if(num == 2){
            System.out.println("非会员身份");
        }else{
            System.out.println("您的输入有误");
        }

    }
}
