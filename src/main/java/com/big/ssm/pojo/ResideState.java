package com.big.ssm.pojo;

public class ResideState {
    private Integer resideid;

    private String residename;

    public Integer getResideid() {
        return resideid;
    }

    public void setResideid(Integer resideid) {
        this.resideid = resideid;
    }

    public String getResidename() {
        return residename;
    }

    public void setResidename(String residename) {
        this.residename = residename == null ? null : residename.trim();
    }
}