package com.itheima.test;

import java.util.Scanner;

public class StringTest2 {
    /*
        需求 : 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
                (不考虑其他字符)

                例如 :  aAb3&c2B*4CD1

                小写字母 : 3个
                大写字母 : 4个
                数字字母 : 4个
     */
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String content = sc.nextLine();

        // 2. 定义三份计数器变量, 用于统计操作
        int smallCount = 0;
        int bigCount = 0;
        int numCount = 0;

        // 3. 遍历字符串, 获取到每一个字符
        char[] chars = content.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // 4. 在遍历的过程中, 加入if判断, 看字符属于哪一种类别
            if (c >= 'a' && c <= 'z') {
                // 5. 对应的计数器变量自增
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }

        // 6. 在遍历结束后, 将统计好的计数器变量, 打印在控制台
        System.out.println("小写字母 : " + smallCount + "个");
        System.out.println("大写字母 : " + bigCount + "个");
        System.out.println("数字字符 : " + numCount + "个");
    }
}
