package com.itheima.test;

public class Test3 {
    /*
        == :
                1. 基本数据类型 : 比较数据值
                2. 引用数据类型 : 比较地址值
     */
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = {11, 22, 33, 44};

        boolean result = checkArrayContent(arr1, arr2);

        System.out.println(result);
    }

    /*
        需求: 定义一个方法, 比较两个数组的内容是否相同
        要求: 长度, 内容, 顺序完全相同
     */
    public static boolean checkArrayContent(int[] arr1, int[] arr2) {
        // 1. 比较两个数组的长度
        if (arr1.length != arr2.length) {
            return false;
        }

        // 2. 比较两个数组的元素内容
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // 3. 如果代码能够走到这里, 代表两个数组长度, 内容, 顺序完全相同
        return true;
    }
}
