package com.rent.domain;

import lombok.Data;

@Data
public class Authcode {
    private Integer rid;

    private String username;

    private String code;

    private String info1;

    private String info2;


}