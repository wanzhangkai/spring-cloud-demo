package com.pipikai.order.service;

import com.pipikai.order.dto.OrderDTO;
import com.pipikai.order.pojo.OrderDetail;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:45
 * Email: zhangkaiwan@qq.com
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

}
