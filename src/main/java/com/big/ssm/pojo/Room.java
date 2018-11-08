package com.big.ssm.pojo;

public class Room {
    private Integer roomid;

    private String description;

    private Integer bednum;

    private Integer guestnum;

    private Integer roomstateid;

    private Integer roomtypeid;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    public Integer getGuestnum() {
        return guestnum;
    }

    public void setGuestnum(Integer guestnum) {
        this.guestnum = guestnum;
    }

    public Integer getRoomstateid() {
        return roomstateid;
    }

    public void setRoomstateid(Integer roomstateid) {
        this.roomstateid = roomstateid;
    }

    public Integer getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(Integer roomtypeid) {
        this.roomtypeid = roomtypeid;
    }
}