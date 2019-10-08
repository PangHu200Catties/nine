package com.rent.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "house")
@Data
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hid;

    private Integer uid;

    private String htitle;

    private String address;

    private String pic1;

    private String pic2;

    private String pic3;

    private String pic4;

    private Float price;

    private String type;

    private Integer lever;

    private Float area;

    private String request;

    private Integer status;

    private String info1;

    private String info2;

    private String info3;


}