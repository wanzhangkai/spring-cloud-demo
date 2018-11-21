package com.pipikai.order.controller;

import com.pipikai.order.converter.OrderForm2OrderDTOConverter;
import com.pipikai.order.dto.OrderDTO;
import com.pipikai.order.enums.ResultEnum;
import com.pipikai.order.exception.OrderException;
import com.pipikai.order.form.OrderForm;
import com.pipikai.order.service.OrderService;
import com.pipikai.order.utils.ResultVOUtils;
import com.pipikai.order.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:43
 * Email: zhangkaiwan@qq.com
 */
@RestController
@Slf4j
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 1.参数检验
     * 2.查询商品信息（调用商品服务）
     * 3.计算总价
     * 4.扣库存（调用商品服务）
     * 5.订单入库
     */
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm,
                                                BindingResult bindingResult) {
        //1.参数检验
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确，orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        // orderForm -> orderDTO
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        OrderDTO result = orderService.create(orderDTO);

        Map<String, String> map = new HashMap<>();
        map.put("orderId", result.getOrderId());

        return ResultVOUtils.success(map);
    }


}
