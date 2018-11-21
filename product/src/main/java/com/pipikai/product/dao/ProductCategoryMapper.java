package com.pipikai.product.dao;

import com.pipikai.product.pojo.ProductCategory;
import org.apache.ibatis.annotations.Mapper;


public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer categoryId);

    ProductCategory selectAll();

    ProductCategory selectByCategoryType(Integer categoryType);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}