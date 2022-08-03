package com.dingq.streamdemo.stream;

import java.util.stream.IntStream;

/**
 * Stream 是一个迭代器，不是一个数据结构，不是集合，不会保存数据
 * Stream 的目的是高效的进行数据的处理，流水线式的处理。
 *
 * @Author dingq
 * @Date 2022-07-07 21:25
 * @Version 1.0
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        int[] nums = {1,3,9,7};
        int inSum = 0;
        int outSum = 0;

        //外部迭代
        for(int i = 0 ;i<nums.length;i++){
            inSum+=nums[i];
            System.out.println(inSum);
        }

        System.out.println("-------------------------");
        //内部迭代
        /*
        * Map中间操作，有返回流水的操作，为中间操作
        * sum终止操作
        * 惰性求值就是终止操作没有被执行的时候中间操作将不会被执行。
        *
        * */
        // outSum = IntStream.of(nums).map(i -> i * 2).sum();  1*2 +3*2+9*2+7*2 = 40
        outSum = IntStream.of(nums).map(i -> 2).sum();
        System.out.println(outSum);
    }
}














