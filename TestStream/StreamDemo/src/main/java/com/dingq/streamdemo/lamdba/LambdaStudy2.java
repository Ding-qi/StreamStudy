package com.dingq.streamdemo.lamdba;

import java.util.function.IntBinaryOperator;

/**
 * @Author dingq
 * @Date 2022-07-11 20:24
 * @Version 1.0
 */
public class LambdaStudy2 {
    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }
    public static void main(String[] args) {

        // 开始的时候使用匿名内部类去写
        //调用了一个方法传入了一个匿名内部类
        //因为传入的是匿名内部类，所有传入的参数是调用匿名内部类里面的参数，left、right
        int sum1 = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println("sum1= "+sum1);
        //优化 首先是接口  里面有一个实现方法
        //int left, int right  是重写方法的参数列表
        // return left + right;重写方法的函数体
        int sum2 = calculateNum((int left, int right)->{
            return left + right;
        });
        System.out.println("sum2= "+sum2);
        //再次优化
        int sum3 = calculateNum((left, right) -> left + right);
        System.out.println("sum3= "+sum3);
        //再次优化
        int sum4 = calculateNum(Integer::sum);
        System.out.println("sum4= "+sum4);
    }
}
