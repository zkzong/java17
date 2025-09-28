package org.example.designpattern.strategy.pay.service;

import org.example.designpattern.strategy.pay.enums.PayEnum;

public interface PaymentStrategy {

    void pay(double amount);

    PayEnum getHandleStrategy();

}
