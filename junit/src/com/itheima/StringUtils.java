package com.itheima;

public class StringUtils {

    public static void printNumber(String s) {
        if (s == null) {
            System.out.println(0);
            return;
        }
        System.out.println("名字长度是" + s.length());
    }

    /**
     * 求字符串最大索引
     *
     * @param s
     * @return
     */
    public static int getMaxIndex(String s) {
        if (s == null) {
            return -1;
        }
//        return s.length();
        return s.length() - 1;
    }

}
