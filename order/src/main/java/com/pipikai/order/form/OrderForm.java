package com.pipikai.order.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 前端传来的表单
 * Created by wanzhangkai
 * 2018/11/21 22:18
 * Email: zhangkaiwan@qq.com
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid为空")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;

}
