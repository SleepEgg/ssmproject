package com.big.ssm.dao;

import com.big.ssm.pojo.ResideState;

public interface ResideStateMapper {
    int deleteByPrimaryKey(Integer resideid);

    int insert(ResideState record);

    int insertSelective(ResideState record);

    ResideState selectByPrimaryKey(Integer resideid);

    int updateByPrimaryKeySelective(ResideState record);

    int updateByPrimaryKey(ResideState record);
}