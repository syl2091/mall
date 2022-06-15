package com.lege.dto;

import lombok.Data;

/**
 * @author lege
 * @Description 生成订单时传入的参数
 * @create 2022-06-15 16:42
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
