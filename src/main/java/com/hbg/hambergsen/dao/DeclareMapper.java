package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Declare;
import java.util.List;

public interface DeclareMapper {
    int deleteByPrimaryKey(Integer declareId);

    int insert(Declare record);

    Declare selectByPrimaryKey(Integer declareId);

    List<Declare> selectAll();

    int updateByPrimaryKey(Declare record);
}