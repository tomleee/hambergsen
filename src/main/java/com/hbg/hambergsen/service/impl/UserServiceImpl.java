package com.hbg.hambergsen.service.impl;

import com.hbg.hambergsen.bean.User;
import com.hbg.hambergsen.constant.ServiceException;
import com.hbg.hambergsen.constant.eneums.ResultEnum;
import com.hbg.hambergsen.dao.UserMapper;
import com.hbg.hambergsen.dto.UserDto;
import com.hbg.hambergsen.service.UserService;
import com.hbg.hambergsen.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(UserDto userDto) {
        // 校验参数
        if (!checkUser(userDto)){
            throw new ServiceException(ResultEnum.NUllPARAM);
        }
        User user = User.builder().build();
        user.setCreateTime(DateUtil.getDate());
        user.setModifyTime(DateUtil.getDate());
        BeanUtils.copyProperties(userDto,user);
        userMapper.insert(user);
    }

    private boolean checkUser(UserDto userDto){
        return true;
    }
}
