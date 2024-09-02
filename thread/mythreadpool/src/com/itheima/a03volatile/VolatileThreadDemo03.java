package com.itheima.a03volatile;

public class VolatileThreadDemo03 {

    public static void main(String[] args) throws InterruptedException {

        // 创建VolatileThread线程对象
        VolatileThread volatileThread = new VolatileThread() ;
        volatileThread.start();

        // main方法
        while(true) {

            // 加锁进行问题处理
            synchronized (volatileThread) {
                if(volatileThread.isFlag()) {
                    System.out.println("执行了======");
                    System.out.println(System.currentTimeMillis());
                    break;
                }
            }

        }

    }
}
