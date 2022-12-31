package com.example.base.service.impl;

import com.example.base.dao.UserInfoMapper;
import com.example.base.pojo.UserInfo;
import com.example.base.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service 注解是将当前类注入到spring容器中
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfo(){
        return userInfoMapper.getUserInfo();
    }
}
