package com.pipikai.product.vo;

import lombok.Data;

/**
 * Created by wanzhangkai
 * 2018/11/20 22:40
 * Email: zhangkaiwan@qq.com
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;

}
