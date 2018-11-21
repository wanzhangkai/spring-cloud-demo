package com.pipikai.product.dao;

import com.pipikai.product.pojo.ProductInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    List<ProductInfo> selectAll(Integer productStatus);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
}