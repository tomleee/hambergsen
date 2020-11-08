package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Container;
import java.util.List;

public interface ContainerMapper {
    int deleteByPrimaryKey(Integer containerId);

    int insert(Container record);

    Container selectByPrimaryKey(Integer containerId);

    List<Container> selectAll();

    int updateByPrimaryKey(Container record);
}