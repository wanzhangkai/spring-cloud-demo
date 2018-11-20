package com.pipikai.product.enums;

import lombok.Getter;

/**
 * Created by wanzhangkai
 * 2018/11/20 22:33
 * Email: zhangkaiwan@qq.com
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
