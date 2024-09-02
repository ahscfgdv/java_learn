public class TypeConversionDemo1 {
    /*
        类型转换 - 隐式转换

            介绍: 将取值范围小的数据或变量, 给取值范围大的变量赋值, 可以直接赋值
                    - 简单记: 小的给大的, 可以直接给

            取值范围从小到大

                    byte -> short -> int -> long -> float -> double

                    问题: float占用4个字节, 为什么放在了long(8个字节)的后面
                    解释: 虽然float占用4个字节, 但是 [取值范围] 要比8个字节的long 更大
                            - 小数的二进制存储形式, 更加节省内存
     */
    public static void main(String[] args) {

        int a = 10;
        double b = a;
        System.out.println(a);      // 10
        System.out.println(b);      // 10.0

        System.out.println("--------------------");

        long num1 = 123L;
        float num2 = num1;
        System.out.println(num2);

        byte aa = 10;
        byte bb = 20;
        int cc = aa + bb;

    }
}
