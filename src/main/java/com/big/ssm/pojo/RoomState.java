package com.big.ssm.pojo;

public class RoomState {
    private Integer roomstateid;

    private String roomstatename;

    public Integer getRoomstateid() {
        return roomstateid;
    }

    public void setRoomstateid(Integer roomstateid) {
        this.roomstateid = roomstateid;
    }

    public String getRoomstatename() {
        return roomstatename;
    }

    public void setRoomstatename(String roomstatename) {
        this.roomstatename = roomstatename == null ? null : roomstatename.trim();
    }
}