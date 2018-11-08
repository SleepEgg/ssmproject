package com.big.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GuestRecord {
    private Integer guestid;

    private String identityid;

    private String guestname;

    private Integer roomid;

    private Integer resideid;

    private Date residedate;

    private Date leavedate;

    private BigDecimal deposit;

    private BigDecimal totalmoney;

    public Integer getGuestid() {
        return guestid;
    }

    public void setGuestid(Integer guestid) {
        this.guestid = guestid;
    }

    public String getIdentityid() {
        return identityid;
    }

    public void setIdentityid(String identityid) {
        this.identityid = identityid == null ? null : identityid.trim();
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname == null ? null : guestname.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getResideid() {
        return resideid;
    }

    public void setResideid(Integer resideid) {
        this.resideid = resideid;
    }

    public Date getResidedate() {
        return residedate;
    }

    public void setResidedate(Date residedate) {
        this.residedate = residedate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }
}