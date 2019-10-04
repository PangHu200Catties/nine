package com.rent.domain;

import java.util.Date;

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

    public User(Integer uid, String username, String password, String upic, String realname, String tel, String nickname, Date ucreamtime, Integer ustatus, String info2, Integer info3) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.upic = upic;
        this.realname = realname;
        this.tel = tel;
        this.nickname = nickname;
        this.ucreamtime = ucreamtime;
        this.ustatus = ustatus;
        this.info2 = info2;
        this.info3 = info3;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUpic() {
        return upic;
    }

    public void setUpic(String upic) {
        this.upic = upic == null ? null : upic.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getUcreamtime() {
        return ucreamtime;
    }

    public void setUcreamtime(Date ucreamtime) {
        this.ucreamtime = ucreamtime;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2 == null ? null : info2.trim();
    }

    public Integer getInfo3() {
        return info3;
    }

    public void setInfo3(Integer info3) {
        this.info3 = info3;
    }
}