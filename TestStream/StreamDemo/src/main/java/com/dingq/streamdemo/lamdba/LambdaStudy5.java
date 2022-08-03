package com.dingq.streamdemo.lamdba;

import java.util.function.IntConsumer;

/**
 * @Author dingq
 * @Date 2022-07-11 21:24
 * @Version 1.0
 */
public class LambdaStudy5 {
    public static void forEachArr(IntConsumer consumer){
        int[] arr = {1,2,3,4,5,6,7,8,9,20};
        for(int i :arr){
            consumer.accept(i);
        }
    }
    public static void main(String[] args) {
        //消费
        forEachArr(new IntConsumer() {
            @Override
            public void accept(int value) {
                //消费
                System.out.println(value);
            }
        });

        System.out.println("**************");
        forEachArr((int value)->{
            System.out.println("======"+value);
        });
        //转成匿名内部类在用快捷键直接到最简化 alt+回车
        System.out.println("====最简化====");
        forEachArr(System.out::println);
    }
}
