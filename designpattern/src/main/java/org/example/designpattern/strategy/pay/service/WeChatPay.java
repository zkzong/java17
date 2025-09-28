package org.example.designpattern.strategy.pay.service;

import org.example.designpattern.strategy.pay.enums.PayEnum;
import org.springframework.stereotype.Service;

@Service
public class WeChatPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用微信支付 " + amount + " 元");
    }

    @Override
    public PayEnum getHandleStrategy() {
        return PayEnum.WXPAY;
    }
}
