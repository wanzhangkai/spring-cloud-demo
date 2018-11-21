package com.pipikai.order.service.impl;

import com.pipikai.order.dao.OrderDetailMapper;
import com.pipikai.order.dao.OrderMasterMapper;
import com.pipikai.order.dto.OrderDTO;
import com.pipikai.order.enums.OrderStatusEnum;
import com.pipikai.order.enums.PayStatusEnum;
import com.pipikai.order.pojo.OrderMaster;
import com.pipikai.order.service.OrderService;
import com.pipikai.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:50
 * Email: zhangkaiwan@qq.com
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private OrderMasterMapper orderMasterMapper;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //todo 2.查询商品信息（调用商品服务）

        //todo 3.计算总价

        // todo 4. 扣库存（调用商品服务）


        //5. 订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(6));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode().byteValue());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode().byteValue());

        orderMasterMapper.insertSelective(orderMaster);
        return orderDTO;
    }
}
