package com.hbg.hambergsen.service;

import com.hbg.hambergsen.bean.Test;
import com.hbg.hambergsen.constant.ResultPage;
import com.hbg.hambergsen.dto.TestDto;

import java.util.List;

public interface TestUserService {

    List<Test> getAll();

    void saveUser(TestDto userDto);

    ResultPage<Test> getAll(int pageNum, int pageSize);
}
