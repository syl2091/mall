package com.lege.service.impl;

import com.lege.common.api.CommonResult;
import com.lege.component.CancelOrderSender;
import com.lege.dto.OrderParam;
import com.lege.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lege
 * @Description
 * @create 2022-06-15 16:43
 */
@Service
@Slf4j
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        // TODO: 2022/6/15  执行一系类下单操作，具体参考mall项目 
        log.info("process generateOrder");
        //下单完成后开启一个延迟消息，用于当用户没有付款时取消订单（orderId应该在下单后生成）
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null, "下单成功");
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        //获取订单超时时间，假设为60分钟
        long delayTimes = 30 * 1000;
        //发送延迟消息
        cancelOrderSender.sendMessage(orderId, delayTimes);
    }

    @Override
    public void cancelOrder(Long orderId) {
        // TODO: 2022/6/15 todo 执行一系类取消订单操作，具体参考mall项目
        log.info("process cancelOrder orderId:{}",orderId);
    }
}
