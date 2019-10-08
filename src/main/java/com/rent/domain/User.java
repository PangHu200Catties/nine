package com.rent.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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