package org.example.designpattern.strategy.pay.controller;

import org.example.designpattern.strategy.pay.enums.PayEnum;
import org.example.designpattern.strategy.pay.service.AliPay;
import org.example.designpattern.strategy.pay.service.PaymentStrategy;
import org.example.designpattern.strategy.pay.service.PaymentStrategyFactory;
import org.example.designpattern.strategy.pay.service.UnionPay;
import org.example.designpattern.strategy.pay.service.WeChatPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    private AliPay aliPay;
    @Autowired
    private WeChatPay weChatPay;
    @Autowired
    private UnionPay unionPay;

    @Autowired
    private PaymentStrategyFactory paymentStrategyFactory;

    @RequestMapping("/pay")
    public void pay(int payType, double amount) {
        switch (payType) {
            // 阿里支付
            case 1:
                aliPay.pay(amount);
                break;
            // 微信支付
            case 2:
                weChatPay.pay(amount);
                break;
            // 银联支付
            case 3:
                unionPay.pay(amount);
                break;
            default:
                throw new IllegalArgumentException("无效的支付类型");
        }
    }

    @RequestMapping("/pay/strategy")
    public void pay2(int payType, double amount) {
        paymentStrategyFactory.getPayment(PayEnum.fromValue(payType))
                .pay(amount);
    }

}
