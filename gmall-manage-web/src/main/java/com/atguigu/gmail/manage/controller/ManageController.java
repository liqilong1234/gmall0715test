package com.atguigu.gmail.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lql
 * @date 2019/12/25-16:44
 */
@RestController
@CrossOrigin
public class ManageController {

    @Reference
    private ManageService manageService;
    @PostMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){

        return manageService.getCatalog1();
    }
    @PostMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        return  manageService.getCatalog2(catalog1Id);
    }
    @PostMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        return  manageService.getCatalog3(catalog2Id);

    }
    @PostMapping("attrInfoList")
    public List<BaseAttrInfo> getAttrList(String catalog3Id){
        return  manageService.getAttrList(catalog3Id);

    }
    @PostMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValueList(String attrId){
        BaseAttrInfo atrrInfo = manageService.getAtrrInfo(attrId);
        return  atrrInfo.getAttrValueList();

    }
    @RequestMapping("saveAttrInfo")
    public  void saveAttrInfo(@RequestBody BaseAttrInfo attrForm){
        manageService.saveAttrInfo(attrForm);
    }




}
