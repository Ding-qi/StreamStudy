package com.dingq.streamdemo.lamdba;

/**
 * @Author dingq
 * @Date 2022-07-06 15:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程创建成功!");
        }).start();
    }
}
