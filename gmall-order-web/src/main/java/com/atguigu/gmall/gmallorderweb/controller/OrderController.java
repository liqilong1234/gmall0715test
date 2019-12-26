package com.atguigu.gmall.gmallorderweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lql
 * @date 2019/12/25-8:45
 */
@RestController
public class OrderController {
    @Reference
    private UserInfoService userInfoService;
    @RequestMapping("findUserAddressListByUserId")
    public List<UserAddress> findUserAddressListByUserId(String userId){
        List<UserAddress> userAddressListByUserId = userInfoService.findUserAddressListByUserId(userId);
        return  userAddressListByUserId;
    }
}
