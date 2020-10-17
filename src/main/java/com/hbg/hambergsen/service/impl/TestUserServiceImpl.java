package com.hbg.hambergsen.service.impl;

import com.hbg.hambergsen.bean.User;
import com.hbg.hambergsen.dao.TestUserMapper;
import com.hbg.hambergsen.service.TestUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public List<User> getAll() {
        return testUserMapper.getAll();
    }
}
