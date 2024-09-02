package com.itheima.test.case1;

public class MyThread2 extends Thread{

    static int number = 1;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread2.class){
                if (number <= 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    isOdd(number);
                    number++;
                } else {
                    break;
                }
            }
        }
    }

    public void isOdd(int num){
        if (num % 2 != 0){
            System.out.println(this.getName());
            System.out.println(num+" is Odd");
        }
    }
}
