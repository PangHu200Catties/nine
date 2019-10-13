package com.rent.utils;

import lombok.Data;

import java.util.List;

/**
 * @author: 陈琪文
 * @description: com.cqw.domain
 * @date: 2019/9/26
 * @time: 17:55
 */
@Data
public class PageBean<T> {
    private List<T> list;
    private long total;

    private int page;
    private  int size;
    private String address;
}