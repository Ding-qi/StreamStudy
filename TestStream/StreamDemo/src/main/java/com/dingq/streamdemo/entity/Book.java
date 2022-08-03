package com.dingq.streamdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author dingq
 * @Date 2022-07-11 19:47
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 *用于后期的去重使用
 */
@EqualsAndHashCode
public class Book {
    private Long id;
    /**
     * 书名
     */
    private String name;
    /**
     * 分类
     */
    private String category;
    /**
     * 评分
     */
    private Integer score;
    /**
     * 简洁
     */
    private String intro;
}