package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.LogList;
import java.util.List;

public interface LogListMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(LogList record);

    LogList selectByPrimaryKey(Integer logId);

    List<LogList> selectAll();

    int updateByPrimaryKey(LogList record);
}