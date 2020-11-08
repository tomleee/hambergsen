package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Charge;
import java.util.List;

public interface ChargeMapper {
    int deleteByPrimaryKey(String chargeId);

    int insert(Charge record);

    Charge selectByPrimaryKey(String chargeId);

    List<Charge> selectAll();

    int updateByPrimaryKey(Charge record);
}