package com.hbg.hambergsen.service.impl;

import com.github.pagehelper.PageHelper;
import com.hbg.hambergsen.bean.Test;
import com.hbg.hambergsen.constant.ResultPage;
import com.hbg.hambergsen.dao.TestUserMapper;
import com.hbg.hambergsen.dto.TestDto;
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
    public List<Test> getAll() {
        return testUserMapper.getAll();
    }

    @Override
    public void saveUser(TestDto userDto) {
        Test user = Test.builder().id(userDto.getId()).name(userDto.getName()).build();
        testUserMapper.saveUser(user);
    }

    @Override
    public ResultPage<Test> getAll(int pageNum, int pageSize) {
        // 这里的分页查询只指针对第一个查询sql生效
        PageHelper.startPage(pageNum, pageSize);
        List<Test> testList = testUserMapper.getAll();
        return new ResultPage<Test>(testList);
    }
}
