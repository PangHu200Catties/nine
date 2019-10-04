package com.rent.domain;

public class House {
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

    public House(Integer hid, Integer uid, String htitle, String address, String pic1, String pic2, String pic3, String pic4, Float price, String type, Integer lever, Float area, String request, Integer status, String info1, String info2, String info3) {
        this.hid = hid;
        this.uid = uid;
        this.htitle = htitle;
        this.address = address;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.pic4 = pic4;
        this.price = price;
        this.type = type;
        this.lever = lever;
        this.area = area;
        this.request = request;
        this.status = status;
        this.info1 = info1;
        this.info2 = info2;
        this.info3 = info3;
    }

    public House() {
        super();
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle == null ? null : htitle.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1 == null ? null : pic1.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3 == null ? null : pic3.trim();
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4 == null ? null : pic4.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3 == null ? null : info3.trim();
    }
}