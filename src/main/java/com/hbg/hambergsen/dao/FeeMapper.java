package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Fee;
import java.util.List;

public interface FeeMapper {
    int deleteByPrimaryKey(Integer feeId);

    int insert(Fee record);

    Fee selectByPrimaryKey(Integer feeId);

    List<Fee> selectAll();

    int updateByPrimaryKey(Fee record);
}