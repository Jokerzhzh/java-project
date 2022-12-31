package com.example.base.controller;

import com.example.base.pojo.UserInfo;
import com.example.base.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/getUserInfo")
    public List<UserInfo> getUserInfo(){
        List<UserInfo> userInfoList = userInfoService.getUserInfo();
        return userInfoList;
    }

}
