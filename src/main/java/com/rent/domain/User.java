package com.rent.domain;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer uid;

    private String username;

    private String password;

    private String upic;

    private String realname;

    private String tel;

    private String nickname;

    private Date ucreamtime;

    private Integer ustatus;

    private String info2;

    private Integer info3;


}