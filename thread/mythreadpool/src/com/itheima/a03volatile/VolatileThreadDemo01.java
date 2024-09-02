package com.itheima.a03volatile;

import java.sql.Time;

public class VolatileThreadDemo01 {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        // 创建VolatileThread线程对象
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.start();

        while (true) {
            // 在main线程中获取开启的线程中flag的值
            if (volatileThread.isFlag()) {
//            System.out.println("main线程中获取开启的线程中flag的值为" + volatileThread.isFlag());
                System.out.println(System.currentTimeMillis());
                break;
            } else {
//                System.out.println("main线程中获取开启的线程中flag的值为" + volatileThread.isFlag());
//                boolean a = volatileThread.isFlag();
            }
        }

    }
}