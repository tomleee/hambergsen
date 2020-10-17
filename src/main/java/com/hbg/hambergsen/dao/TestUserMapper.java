package com.hbg.hambergsen.dao;

import com.hbg.hambergsen.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestUserMapper  {

    List<User> getAll();
}
