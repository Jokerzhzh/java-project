package com.example.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.base.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
//@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    List<UserInfo> getUserInfo();

}
