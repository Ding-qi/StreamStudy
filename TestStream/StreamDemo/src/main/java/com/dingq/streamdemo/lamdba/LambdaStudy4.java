package com.dingq.streamdemo.lamdba;

import java.util.function.Function;

/**
 * @Author dingq
 * @Date 2022-07-11 21:04
 * @Version 1.0
 */
public class LambdaStudy4 {
    public static <R> R typeConver(Function<String,R> function){
        String str = "12345";
        R result = function.apply(str);
        return result;
    }

    public static void main(String[] args) {
        //参数类型是第一个泛型的类型，返回值是第二个泛型的类型
        Integer integer1 = typeConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        System.out.println("Integer =" +integer1);
        System.out.println("================");

        //lambda表达式
        Integer integer2 = typeConver((String s)->{return Integer.valueOf(s);});
        System.out.println("Integer===" + integer2);


        String str1 = typeConver(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + "2022年7月11日21点32分";
            }
        });
        System.out.println("String == " + str1);
        System.out.println("================");

        String str2 = typeConver((String s)->{return s + "2022年7月11日21点52分";});
        System.out.println("str2 == " + str2);

    }
}







