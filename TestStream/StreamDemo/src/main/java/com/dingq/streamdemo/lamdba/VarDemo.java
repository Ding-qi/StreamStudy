package com.dingq.streamdemo.lamdba;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author dingq
 * @Date 2022-07-07 19:46
 * @Version 1.0
 */
public class VarDemo {
    public static void main(String[] args) {
        //当lambda表达式引入外部变量的时候，属于值传递，不是引入传递。外部变量必须是不可修改的，也就是final的。
        // 防止lambda内部引用的变量值和外部的变量值不一样，出现二义性。也就是歧义
        List<String> list = new ArrayList<>();
        list.add("");
        String str = "";
        Consumer<String> consumer = s -> System.out.println(s + list);
        consumer.accept("1111");
    }
}
