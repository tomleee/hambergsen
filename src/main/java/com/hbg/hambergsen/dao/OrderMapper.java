package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    Order selectByPrimaryKey(String orderId);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}