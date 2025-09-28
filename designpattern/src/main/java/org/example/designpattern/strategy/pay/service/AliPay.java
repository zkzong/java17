package org.example.designpattern.strategy.pay.service;

import org.example.designpattern.strategy.pay.enums.PayEnum;
import org.springframework.stereotype.Service;

@Service
public class AliPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付 " + amount + " 元");
    }

    @Override
    public PayEnum getHandleStrategy() {
        return PayEnum.ALIPAY;
    }
}
