package com.itheima.test;

public class Test4_2 {
    public static void main(String[] args) {

        int[] arr = {19, 28, 37, 46, 50, 19, 19};
                  // 0    1   2   3   4   5   6

        int[] results = getIndex(28, arr);

        if(results.length == 0){
            System.out.println("您要查找的元素, 在数组中不存在");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i]);
            }
        }

    }

    /*
        需求: 设计一个方法, 查找元素在数组中的索引位置 (考虑重复元素问题)
        注意: return只能返回一个结果

        问题: 当一个方法运行结束后, 有多个结果需要返回, 怎么处理?
        回答: 可以将多个结果, 存入一个数组容器, 将数组返回.
     */
    public static int[] getIndex(int num, int[] arr) {
        // 1. 统计要查找的元素, 在数组中出现的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                count++;
            }
        }
        // 2. 根据统计出来的个数, 创建数组容器
        int[] results = new int[count];

        int index = 0;

        // 3. 查找元素在数组中的索引, 将找到的索引, 存入数组容器
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                // results[0] = 0;
                // results[1] = 5;
                // results[2] = 6;
                results[index] = i;
                index++;
            }
        }

        // 4. 将装满了索引的数组, 返回
        return results;
    }
}
