package com.big.ssm.service.IService;

import com.big.ssm.dao.RoomMapper;
import com.big.ssm.pojo.Room;
import com.big.ssm.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomMapper roomMapper;
    public List<Room> getAllRoom(){
        return roomMapper.getAllRoom();
    }

    @Override
    public int addRoom(Room room) {
        return roomMapper.addRoom(room);
    }

    @Override
    public int deleteRoom(Room room) {
        return roomMapper.deleteRoom(room);
    }
}
