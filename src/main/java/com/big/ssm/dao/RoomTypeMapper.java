package com.big.ssm.dao;

import com.big.ssm.pojo.RoomType;

public interface RoomTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    RoomType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);
}