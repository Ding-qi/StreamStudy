package com.dingq.streamdemo.stream;

import com.dingq.streamdemo.entity.Author;
import com.dingq.streamdemo.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @Author dingq
 * @Date 2022-07-14 19:41
 * @Version 1.0
 */
public class StreamStudy1 {
    private static List<Author> getAuthors(){
        //数据初始化
        Author author = new Author(1L,"蒙多",33,"一个从菜刀中明悟哲理的祖安人",null);
        Author author1 = new Author(3L,"丁歧",15,"不爽的丁歧",null);
        Author author2 = new Author(3L,"丁歧",15,"不爽的丁歧",null);
        Author author3 = new Author(4L,"李燕",15,"脾气爱变得宝宝",null);

        //书籍列表
        List<Book> books = new ArrayList<>();
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();

        books.add(new Book(1L,"到的两侧石光明和黑暗","哲学,爱情",88,"用一把刀划分了爱和恨"));
        books.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",89,"讲述如何从失败中明悟真理！"));

        books1.add(new Book(3L,"哪锋吹不到的地方","哲学,爱情",78,"讲述如何从失败中明悟真理！"));
        books1.add(new Book(3L,"哪锋吹不到的地方","哲学,爱情",23,"讲述如何从失败中明悟真理！"));
        books1.add(new Book(4L,"哪锋吹不到的地方","爱情",28,"讲述如何从失败中明悟真理！"));

        books2.add(new Book(5L,"你就说我的剑客","爱情",78,"讲述如何从失败中明悟真理！"));
        books2.add(new Book(6L,"你就说我的剑客","个人传记",58,"讲述如何从失败中明悟真理！"));
        books2.add(new Book(6L,"你就说我的剑客","个人传记",76,"讲述如何从失败中明悟真理！"));

        author.setBooks(books);
        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books2);
        return new ArrayList<>(Arrays.asList(author,author1,author2,author3));
    }

    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        //System.out.println(authors);
        //调用getAuthors方法获取到作家的集合，现在需要打印所有年龄小于18的作家的名字，并且进行去重。
        System.out.println("==============");
        authors.stream()//把集合转换成流
        .distinct()//去重
        .filter(author -> author.getAge()<18) //过滤 年龄小于18
        .forEach(author -> { //终止操作
            //变量消费的年龄
            System.out.println(author.getName());
        });

    }
}












