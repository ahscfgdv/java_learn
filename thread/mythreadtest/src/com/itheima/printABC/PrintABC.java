package com.itheima.printABC;

public class PrintABC {
    private int state = 0; // 用来控制打印顺序的标志位，0-a, 1-b, 2-c
    private final Object monitor = new Object();

    class ThreadA implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (monitor) {
                    if (state % 3 == 0) { // 当state为0时打印a
                        System.out.print("a");
                        state++;
                        monitor.notifyAll(); // 唤醒其他等待的线程
                    } else {
                        try {
                            monitor.wait(); // 等待
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
            }
        }
    }

    class ThreadB implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (monitor) {
                    if (state % 3 == 1) { // 当state为1时打印b
                        System.out.print("b");
                        state++;
                        monitor.notifyAll(); // 唤醒其他等待的线程
                    } else {
                        try {
                            monitor.wait(); // 等待
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
            }
        }
    }

    class ThreadC implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (monitor) {
                    if (state % 3 == 2) { // 当state为2时打印c，并重置state以便循环
                        System.out.println("c"); // 使用println以换行
                        state = 0;
                        monitor.notifyAll();
//                        monitor.notify();// 唤醒其他等待的线程
                    } else {
                        try {
                            monitor.wait(); // 等待
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintABC printABC = new PrintABC();
        new Thread(printABC.new ThreadA()).start();
        new Thread(printABC.new ThreadB()).start();
        new Thread(printABC.new ThreadC()).start();
    }
}
