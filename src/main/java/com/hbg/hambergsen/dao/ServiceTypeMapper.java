package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.ServiceType;
import java.util.List;

public interface ServiceTypeMapper {
    int deleteByPrimaryKey(Integer serviceId);

    int insert(ServiceType record);

    ServiceType selectByPrimaryKey(Integer serviceId);

    List<ServiceType> selectAll();

    int updateByPrimaryKey(ServiceType record);
}