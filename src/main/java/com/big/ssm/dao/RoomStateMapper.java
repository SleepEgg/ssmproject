package com.big.ssm.dao;

import com.big.ssm.pojo.RoomState;

public interface RoomStateMapper {
    int deleteByPrimaryKey(Integer roomstateid);

    int insert(RoomState record);

    int insertSelective(RoomState record);

    RoomState selectByPrimaryKey(Integer roomstateid);

    int updateByPrimaryKeySelective(RoomState record);

    int updateByPrimaryKey(RoomState record);
}