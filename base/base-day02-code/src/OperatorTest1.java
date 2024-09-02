import java.util.Scanner;

public class OperatorTest1 {
    /*
        需求: 键盘录入一个三位数, 将数值拆分出个位, 十位, 百位, 随后打印在控制台

                数值拆分的公式 :

                    个位: 数值 % 10
                    十位: 数值 / 10 % 10
                    百位: 数值 / 10 / 10 % 10
                    千位: 数值 / 10 / 10 / 10 % 10
                    ...

                 对于数值的最高位, 简化处理

                    123 : 百位            123 / 100  ---> 1
                    1234 : 千位           1234 / 1000 ---> 1
                    12345 : 万位          12345 / 10000 ---> 1
     */
    public static void main(String[] args) {

        // 1. 召唤Scanner精灵
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        // 2. 指挥精灵, 从键盘录入一个整数
        int num = sc.nextInt();
        // 3. 数值拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        // 4. 将拆分后的数据, 打印在控制台
        System.out.println("整数" + num + "的个位为:" + ge);
        System.out.println("整数" + num + "的十位为:" + shi);
        System.out.println("整数" + num + "的百位为:" + bai);



        System.out.println("5+5="+(5+5));
        // A: 5+5=10
        // B: 5+5=55
        // C: 钝角

    }
}
