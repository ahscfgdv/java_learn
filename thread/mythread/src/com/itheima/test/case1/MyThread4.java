package com.itheima.test.case1;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class MyThread4 extends Thread {


    //可以用数组定义红包
    static ArrayList<Integer> hongbao = new ArrayList<Integer>();
    // 结果集合不能是静态的否则会让所有线程的结果放在一起
    ArrayList<Integer> result = new ArrayList<Integer>();
    static HashMap<String, Integer> MAX = new HashMap<String, Integer>();
    ArrayBlockingQueue<String> queue;


    MyThread4(ArrayBlockingQueue<String> queue) {
        for (int i = 0; i < 100; i++) {
//            hongbao.add((int) (Math.random() * 1000));
            hongbao.add(i);
        }
        Collections.shuffle(hongbao);
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (MyThread4.class) {
                if (hongbao.isEmpty()) {
                    int sum = 0;
                    int max = 0;
                    for (Integer i : result) {
                        sum += i;
                        max = Math.max(max, i);
                    }
//                    System.out.println(this.getName());
//                    System.out.println(sum);
//                    System.out.println(max);
//                    MAX.put(this.getName(), max);
//                    System.out.println(MAX);
//                    print(MAX);
                    try {
                        queue.put(this.getName() + max);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    result.add(hongbao.removeLast());
                }
            }
        }

    }

    public void print(HashMap<String, Integer> MAX) {
        // 找到具有最大值的键值对
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : MAX.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey + ":" + maxValue);
    }
}
