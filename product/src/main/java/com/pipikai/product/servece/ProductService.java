package com.pipikai.product.servece;

import com.pipikai.product.pojo.ProductInfo;

import java.util.List;

/**
 * Created by wanzhangkai
 * 2018/11/20 22:51
 * Email: zhangkaiwan@qq.com
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();


}
