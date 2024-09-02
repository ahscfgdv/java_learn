package com.itheima.test.case1;

public class MyThread1 extends Thread{

    static int ticket = 1000;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread1.class){
                if (ticket > 0){
                    ticket--;
                    System.out.println(this.getName());
                    System.out.println("剩余"+ticket+"张票");
                } else {
                    break;
                }
            }
        }
    }
}
