package com.rent.domain;

import lombok.Data;

import java.util.List;

/**
 * @author: 吴佐彬
 * @Date: 2019/10/8
 * @Time: 14:20
 * @description:
 */
@Data
public class HousePageBean {
    private long total;
    private List<House> listHouse;
}
