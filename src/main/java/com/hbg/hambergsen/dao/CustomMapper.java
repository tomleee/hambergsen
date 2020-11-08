package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Custom;
import java.util.List;

public interface CustomMapper {
    int deleteByPrimaryKey(Integer customId);

    int insert(Custom record);

    Custom selectByPrimaryKey(Integer customId);

    List<Custom> selectAll();

    int updateByPrimaryKey(Custom record);
}