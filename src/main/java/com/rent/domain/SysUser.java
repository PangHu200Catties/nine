package com.rent.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
@AllArgsConstructor
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer userid;

    @Column(name = "username")
    private String loginName;

    private String password;

    @Column(name = "upic")
    private String  pic;

    @Column(name = "realname")
    private String realName;

    private String tel;

    @Column(name = "nickname")
    private String  nickName;

    @Column(name = "ucreatetime")
    private Date createTime;

    @Column(name = "ustatus")
    private int status;

    public SysUser() {

    }
}