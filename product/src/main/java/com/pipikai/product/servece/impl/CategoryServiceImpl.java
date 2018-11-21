package com.pipikai.product.servece.impl;

import com.pipikai.product.dao.ProductCategoryMapper;
import com.pipikai.product.pojo.ProductCategory;
import com.pipikai.product.servece.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wanzhangkai
 * 2018/11/21 16:57
 * Email: zhangkaiwan@qq.com
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> findByCategoryType(List<Integer> categoryTypeList) {
        List<ProductCategory> productCategoryList = new ArrayList<>();
        Set<Integer> uniSet = new HashSet<>();
        for (Integer integer : categoryTypeList) {
            ProductCategory temp = productCategoryMapper.selectByCategoryType(integer);
            Integer idTemp = temp.getCategoryId();
            if (!uniSet.contains(idTemp)) {
                uniSet.add(idTemp);
                productCategoryList.add(temp);
            }
        }
        uniSet.clear();
        return productCategoryList;
    }


}
