package com.dingq.streamdemo.lamdba;

import java.util.function.IntPredicate;

/**
 * @Author dingq
 * @Date 2022-07-11 20:42
 * @Version 1.0
 */
public class LambdaStudy3 {
    /**
     * 现有方法定义如下，IntPredicate，先使用匿名内部类的写法调用该方法。
     * @param predicate
     */
    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i : arr){
            //predicate.test() 相当于调用匿名内部类中的test方法进行传参
            if(predicate.test(i)){
                System.out.println("i =" + i);
            }
        }
    }

    public static void main(String[] args) {
        printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });
        //优化
        System.out.println("###########");
        //arr 对2其余 如果是0 则为true
        printNum((int value)->{return value % 2 == 0;});
    }
}






















