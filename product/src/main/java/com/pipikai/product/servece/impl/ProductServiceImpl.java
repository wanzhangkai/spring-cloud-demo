package com.pipikai.product.servece.impl;

import com.pipikai.product.dao.ProductInfoMapper;
import com.pipikai.product.enums.ProductStatusEnum;
import com.pipikai.product.pojo.ProductInfo;
import com.pipikai.product.servece.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wanzhangkai
 * 2018/11/20 22:59
 * Email: zhangkaiwan@qq.com
 */
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoMapper.selectAll(ProductStatusEnum.UP.getCode());
    }


}
