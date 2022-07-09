package com.dingq.streamdemo.lamdba;

/**
 * @Author dingq
 * @Date 2022-07-05 20:00
 * @Version 1.0
 */
public class LambdaThread {
    /**
     * 输出结果
     * Thread-0线程创建成功!
     * Thread-1函数式编程，线程创建成功!
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程创建成功!");
            }
        }).start();

        // Java 8 函数式编程
        //lambda 返回一个指定接口的对象实例，区分带参、无惨、有返回值、无返回值。方法的输入和输出！
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + "函数式编程，线程创建成功!");
        new Thread(runnable).start();
    }
}
