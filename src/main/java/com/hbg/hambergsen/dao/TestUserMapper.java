package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestUserMapper  {

    List<Test> getAll();

    void saveUsers(Test userDto);

}
