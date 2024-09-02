package com.itheima.test.case1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        for (int i = 0; i < 2; i++) {
            Thread t = new MyThread4(queue);
            t.setName(i + "asd");
            t.start();
        }

        Thread s = new Statistics(queue);
        s.start();


    }

}
