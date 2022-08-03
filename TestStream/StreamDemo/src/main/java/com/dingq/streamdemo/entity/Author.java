package com.dingq.streamdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author dingq
 * @Date 2022-07-11 19:49
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode  //用于后期的去重使用
public class Author {

    private Long id;

    private String name;

    private Integer age;
    /**
     * 简洁
     */
    private String intro;
    /**
     * 作品
     */
    private List<Book> books;
}
