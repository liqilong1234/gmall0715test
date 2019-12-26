package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

/**
 * @author lql
 * @date 2019/12/25-16:33
 */
public interface ManageService {
    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    /**
     * 保存平台属性-平台属性值
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 通过attrId 查询平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 通过平台属性attrId 查询平台属性对象
     * @param attrId
     * @return
     */
    BaseAttrInfo getAtrrInfo(String attrId);

}
