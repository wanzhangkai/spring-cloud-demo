package com.pipikai.order.enums;

import lombok.Getter;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:37
 * Email: zhangkaiwan@qq.com
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    FINISHED(1, "支付成功")
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
