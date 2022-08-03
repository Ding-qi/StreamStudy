package com.dingq.streamdemo.lamdba;

/**
 * @Author dingq
 * @Date 2022-07-11 20:16
 * @Version 1.0
 */
public class LambdaStudy1 {
    public static void main(String[] args) {
        //匿名内部类  .start() 线程启动
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我想象的 可能比你想的好");
            }
        }).start();
        // 格式：(参数列表) -> {代码}
        //使用Lambda的格式对其修改  接口中只有一个抽象方法时才可以使用lambda表达式
        new Thread(()->{
            System.out.println("Lambda表达式的格式");
        }).start();
    }
}
