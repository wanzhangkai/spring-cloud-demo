package com.pipikai.order.enums;

import lombok.Getter;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:37
 * Email: zhangkaiwan@qq.com
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新下单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
