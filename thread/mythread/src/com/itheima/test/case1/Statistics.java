package com.itheima.test.case1;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Statistics extends Thread {

    ArrayBlockingQueue<String> queue;

    public Statistics(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    ArrayList<String> a = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
//                System.out.println(food);
                a.add(food);
                if(a.size() == 2) {
                    System.out.println(a);
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
