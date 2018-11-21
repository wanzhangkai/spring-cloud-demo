package com.pipikai.order.enums;

import lombok.Getter;

/**
 * Created by wanzhangkai
 * 2018/11/21 22:29
 * Email: zhangkaiwan@qq.com
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2,"购物车为空")
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
