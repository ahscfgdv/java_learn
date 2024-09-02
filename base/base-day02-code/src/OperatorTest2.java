public class OperatorTest2 {
    /*
        看程序说结果
     */
    public static void main(String[] args) {

        int x = 10;
        int y = x++;    // y = 10, x = 11;
        int z = ++y;    // y = 11, z = 11;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);


        System.out.println("-------------------");

        int a = 3;
                // 4  +  4 + 50
        int b = (++a) + (a++) + (a * 10);
        System.out.println("a=" + a);       // 5
        System.out.println("b=" + b);       // 58

    }
}
