package com.example.base.controller;

import com.example.common.utils.RetInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController {
    @GetMapping("/getTest")
    public String getTest(){
        return "调用接口成功！";
    }

    @GetMapping("/RetInfoTest")
    public RetInfo userNewInfo(){
        return RetInfo.success("测试RetInfo 自定义返回值 code msg data");
    }

}
