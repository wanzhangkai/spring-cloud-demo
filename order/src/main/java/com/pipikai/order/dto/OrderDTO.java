package com.pipikai.order.dto;

import com.pipikai.order.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:47
 * Email: zhangkaiwan@qq.com
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Byte orderStatus;

    private Byte payStatus;

    private List<OrderDetail> orderDetailList;
}
