package com.itheima.test;

public class ForTest {
    public static void main(String[] args) {
        // 生成方法返回值快捷键:
        //      1, 方法名().var + 回车
        //      2, ctrl + alt + V
        int result = getSum();
        System.out.println("1~100之间的偶数和为:" + result);
        System.out.println("-------------------");

        daffodilNumber();

        System.out.println("-------------------");

        int count = daffodilCount();
        System.out.println("水仙花数的个数为:" + count);

        System.out.println("-------------------");

        printTriangle();

        System.out.println("-------------------");

        print99();
    }

    /*
        需求: 在控制台使用 * 打印4行5列矩形

                *****
                *****
                *****
                *****

                System.out.println();   打印数据后, 有换行效果
                System.out.print();     打印数据后, 没有换行效果
     */
    public static void printRectangle() {

        // 外循环: 控制行数
        for (int i = 1; i <= 4; i++) {
            // 内循环: 控制列数
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
        需求: 在控制台使用 * 打印5行的直角三角形

                *
                **
                ***
                ****
                *****

                ---------------

                *****
                ****
                ***
                **
                *

     */
    public static void printTriangle() {
        // 外循环: 控制行数
        for(int i = 1; i <= 5; i++){
            // 内循环: 控制列数
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        // 外循环: 控制行数
        for(int i = 5; i >= 1; i--){
            // 内循环: 控制列数
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
        需求: 在控制台打印出 99乘法表

            1*1=1
            1*2=2 2*2=4
            1*3=3 2*3=6 3*3=9
            1*4=4 2*4=8 3*4=12 4*4=16
            1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
            ...

        1. 9行9列的矩形
        2. 9行的直角三角形
        3. 99乘法表

        规律:
               乘号左侧数据 : 每一行都是从1开始, 逐个+1进行增长     --> j
               乘号右侧数据 : 在每一行中, 数据都是固定不变的        --> i
     */
    public static void print99(){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }

    /*
        需求: 使用循环在控制台打印n次黑马程序员
     */
    public static void print(int n) {

        if (n < 1) {
            System.out.println("您传入的参数有误, 请检查!");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("黑马程序员");
            }
        }
    }

    /*
        需求: 使用循环模拟计时器
                    在控制台打印数字 1~3    积累思路: 循环中控制循环的那个变量, 可以在循环体中, 继续使用的
                    在控制台打印数字 3~1    积累思路: 循环的条件控制语句, 不要局限的认为, 只能是--
     */
    public static void printNumber() {

        for (int i = 1; i <= 3; i++) {
            // i = 1
            // i = 2
            // i = 3
            System.out.println(i);
        }

        System.out.println("--------------");

        for (int i = 3; i >= 1; i--) {
            // i = 3
            // i = 2
            // i = 1
            System.out.println(i);
        }
    }

    /*
        需求: 求 1 ~ 100 之间的偶数和, 并把求和结果打印在控制台

        // 1. 定义求和变量, 准备记录累加的结果
        int sum = 0;
        // 2. 通过for循环, 获取1~100之间的每一个数据
        for(int i = 1; i <= 100; i++){
            // i : 1 ~ 100 之间的每一个数据
            // 3. 在循环中加入if判断, 筛选出偶数
            if(i % 2 == 0){
                // 4. 累加求和
                sum += i;
            }
        }
        return sum;
     */
    public static int getSum() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    /*
        需求: 在控制台输出所有的水仙花数
        规则:
                1. 水仙花数是一个三位数
                2. 水仙花数的个位、十位、百位的数字立方和等于原数
     */
    public static void daffodilNumber() {
        // 1. 获取到所有的三位数
        for (int i = 100; i <= 999; i++) {
            // 2. 将每一个三位数, 拆分出个位, 十位, 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            // 3. 判断
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                // 4. 打印水仙花数
                System.out.println(i);
            }
        }
    }

    /*
        需求: 统计水仙花数的个数
     */
    public static int daffodilCount() {

        // 1. 定义一个计数器变量, 准备统计水仙花数的个数
        int count = 0;

        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                // 2. 找到水仙花数, 让计数器变量自增 (查数)
                System.out.println(i);
                count++;
            }
        }
        // 3. 将计数器变量所记录的值返回
        return count;
    }

}
