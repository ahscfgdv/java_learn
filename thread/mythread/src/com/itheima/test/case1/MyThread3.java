package com.itheima.test.case1;

public class MyThread3 extends Thread {


    //可以用数组定义红包
    static int hongbao = 3;

    @Override
    public void run() {

        synchronized (MyThread3.class) {
            if (hongbao > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.getName());
                System.out.println("抢到了");
                hongbao--;
            } else {
                System.out.println(this.getName());
                System.out.println("没抢到");
            }

        }

    }
}
