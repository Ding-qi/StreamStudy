package com.dingq.streamdemo.lamdba;

import java.util.stream.IntStream;

/**
 * @Author dingq
 * @Date 2022-07-05 20:56
 * @Version 1.0
 */
public class MinDemo {
    public static void main(String[] args) {
        int[] nums = {1, 23, 4, 5, 7};
        //min 一个保持int可以具有的最大值的常数，2 31 -1。
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);
        //Java 8 函数式编程，多线程并行执行
        //min() 流中最小的元素
        int min1 = IntStream.of(nums).min().getAsInt();
        //getAsInt() 如果此OptionalInt中存在值，则返回该值，
        int min2 = IntStream.of(nums).parallel().min().getAsInt();
        System.out.println(min1);
        System.out.println(min2);

    }
}
