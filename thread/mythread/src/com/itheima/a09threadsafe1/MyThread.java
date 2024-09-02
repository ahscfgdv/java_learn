package com.itheima.a09threadsafe1;

public class MyThread extends Thread {

    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;//0 ~ 99

    //锁对象一定是唯一的
    //使用this当锁是不行的每次执行锁对象就是线程本身的对象不能完成互斥锁

    @Override
    public void run() {
            while (true) {
                synchronized (MyThread.class) {
                //同步代码块
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
                } else {
                    break;
                }
            }
        }
    }



}
