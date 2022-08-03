package com.dingq.streamdemo.stream;

import com.dingq.streamdemo.entity.Student;
import org.apache.commons.collections4.MapUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author dingq
 * @Date 2022-07-09 9:59
 * @Version 1.0
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("小马", 20), new Student("小雷", 30), new Student("小王", 40));
        List<Integer> collect = list.stream().map(s -> s.getAge()).collect(Collectors.toList());
        Set<Integer> collect1 = list.stream().map(s -> s.getAge()).collect(Collectors.toSet());
        TreeSet<Integer> collect2 = list.stream().map(s -> s.getAge()).collect(Collectors.toCollection(TreeSet::new));
        //拿到统计汇总信息
        list.stream().collect(Collectors.summarizingInt(Student::getAge));
        //分块
        list.stream().collect(Collectors.partitioningBy(student -> student.getAge() < 20));
        //分组
        Map<Integer, List<Student>> collect3 = list.stream().collect(Collectors.groupingBy(student -> student.getAge()));
        MapUtils.verbosePrint(System.out,"每组",collect3);
        //获得每个年龄有的人数
        list.stream().collect(Collectors.groupingBy(student -> student.getAge(),Collectors.counting()));
    }
}
