package com.itheima;


import org.junit.*;

// 测试类
/*
 * 测试方法必须是公共的 无参的 无返回值的
 * BeforeClass 修饰静态方法在测试类开始执行时运行
 * Before 在每一个测试方法开始执行时运行
 * Before 用于连接资源
 * after 用于释放资源
 * */
public class StringUtilsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before begin");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before class begin");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After begin");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After class begin");
    }

    //    @Test
    @Test
    public void testPrintNumber() {
        StringUtils.printNumber("liu");
        StringUtils.printNumber(null);
    }

    @Test
    public void testGetMaxIndex(){
        int index1 = StringUtils.getMaxIndex("liu");
        int index2 = StringUtils.getMaxIndex(null);
        System.out.println(index1);
        System.out.println(index2);

        //断言预测业务方法的结果来判断
        Assert.assertEquals("have bug",2, index1);
    }
}
