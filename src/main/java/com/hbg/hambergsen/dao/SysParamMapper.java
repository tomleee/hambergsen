package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.SysParam;
import java.util.List;

public interface SysParamMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(SysParam record);

    SysParam selectByPrimaryKey(Byte id);

    List<SysParam> selectAll();

    int updateByPrimaryKey(SysParam record);
}