package com.pipikai.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pipikai.product.pojo.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * Created by wanzhangkai
 * 2018/11/20 22:41
 * Email: zhangkaiwan@qq.com
 */
@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("id")
    private Integer categoryId;

    @JsonProperty("foods")
    private List<ProductInfo> productInfoList;

}
