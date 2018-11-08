package com.big.ssm.dao;

import com.big.ssm.pojo.Room;

import java.util.List;

public interface RoomMapper {
    public List<Room> getAllRoom();
    public int addRoom(Room room);
    public int deleteRoom(Room room);
}