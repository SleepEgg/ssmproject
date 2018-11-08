package com.big.ssm.dao;

import com.big.ssm.pojo.GuestRecord;

public interface GuestRecordMapper {
    int deleteByPrimaryKey(Integer guestid);

    int insert(GuestRecord record);

    int insertSelective(GuestRecord record);

    GuestRecord selectByPrimaryKey(Integer guestid);

    int updateByPrimaryKeySelective(GuestRecord record);

    int updateByPrimaryKey(GuestRecord record);
}