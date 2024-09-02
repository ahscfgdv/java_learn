package com.itheima.a10threadsafe2;

public class MyRunnable implements Runnable {

    int ticket = 0;

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块（同步方法）
            if (method()) break;
        }
    }

    // 非静态方法的锁对象是this 静态方法的锁对象是类的字节码文件
    private synchronized boolean method() {
        //3.判断共享数据是否到了末尾，如果到了末尾
        if (ticket == 100) {
            return true;
        } else {
            //4.判断共享数据是否到了末尾，如果没有到末尾
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票！！！");
        }
        return false;
    }
}
