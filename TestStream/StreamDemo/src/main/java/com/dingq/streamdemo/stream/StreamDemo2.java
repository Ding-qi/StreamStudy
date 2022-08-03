package com.dingq.streamdemo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Author dingq
 * @Date 2022-07-09 9:49
 * @Version 1.0
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //流的创建
        Stream.of(list);
        list.stream();
        list.parallelStream();
        //数组的创建
        Arrays.stream(new int[]{2,3,7});
        //使用random创建一个无限流
        new Random().ints().limit(10);
        //自己产生流
        Random random = new Random();
        Stream.generate(()->random.nextInt()).limit(20);
    }
}
