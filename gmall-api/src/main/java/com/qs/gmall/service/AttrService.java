package com.qs.gmall.service;

import com.qs.gmall.bean.PmsBaseAttrInfo;
import com.qs.gmall.bean.PmsBaseAttrValue;
import com.qs.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
