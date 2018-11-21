package com.pipikai.product.servece;

import com.pipikai.product.pojo.ProductCategory;

import java.util.List;

/**
 * Created by wanzhangkai
 * 2018/11/20 22:52
 * Email: zhangkaiwan@qq.com
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryType(List<Integer> categoryTypeList);

}
