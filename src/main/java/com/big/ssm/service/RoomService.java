package com.big.ssm.service;

import com.big.ssm.pojo.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    public List<Room> getAllRoom();
    public int addRoom(Room room);
    public int deleteRoom(Room room);
}
