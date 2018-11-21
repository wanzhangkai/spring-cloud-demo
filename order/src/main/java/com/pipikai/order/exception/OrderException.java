package com.pipikai.order.exception;

import com.pipikai.order.enums.ResultEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wanzhangkai
 * 2018/11/21 22:24
 * Email: zhangkaiwan@qq.com
 */
@Slf4j
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
