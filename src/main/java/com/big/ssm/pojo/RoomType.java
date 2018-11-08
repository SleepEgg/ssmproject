package com.big.ssm.pojo;

import java.math.BigDecimal;

public class RoomType {
    private Integer typeid;

    private String typename;

    private BigDecimal typeprice;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public BigDecimal getTypeprice() {
        return typeprice;
    }

    public void setTypeprice(BigDecimal typeprice) {
        this.typeprice = typeprice;
    }
}