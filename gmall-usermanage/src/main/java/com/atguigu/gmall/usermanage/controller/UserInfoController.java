package com.atguigu.gmall.usermanage.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lql
 * @date 2019/12/24-21:13
 */
@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){

        return userInfoService.findAll();
    }
}
