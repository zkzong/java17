package org.example.designpattern.strategy.pay.service;

import org.example.designpattern.strategy.pay.enums.PayEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PaymentStrategyFactory {

    public final ConcurrentHashMap<PayEnum, PaymentStrategy> handlerStrategyMap = new ConcurrentHashMap<>();

    @Autowired
    public PaymentStrategyFactory(List<PaymentStrategy> iHandlers) {
        iHandlers.forEach(x -> handlerStrategyMap.put(x.getHandleStrategy(), x));
    }

    public PaymentStrategy getPayment(PayEnum payEnum) {
        return handlerStrategyMap.get(payEnum);
    }

}
