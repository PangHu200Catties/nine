package com.rent.domain;

public class Admin {
    private Integer aid;

    private String ausername;

    private String apassword;

    private String info1;

    private String info2;

    public Admin(Integer aid, String ausername, String apassword, String info1, String info2) {
        this.aid = aid;
        this.ausername = ausername;
        this.apassword = apassword;
        this.info1 = info1;
        this.info2 = info2;
    }

    public Admin() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername == null ? null : ausername.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
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