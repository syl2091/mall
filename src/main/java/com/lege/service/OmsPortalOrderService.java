package com.lege.service;

import com.lege.common.api.CommonResult;
import com.lege.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lege
 * @Description 前台订单管理Service
 * @create 2022-06-15 16:39
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
