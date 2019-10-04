package com.rent.domain;

public class Authcode {
    private Integer rid;

    private String username;

    private String code;

    private String info1;

    private String info2;

    public Authcode(Integer rid, String username, String code, String info1, String info2) {
        this.rid = rid;
        this.username = username;
        this.code = code;
        this.info1 = info1;
        this.info2 = info2;
    }

    public Authcode() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1 == null ? null : info1.trim();
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2 == null ? null : info2.trim();
    }
}