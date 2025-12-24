package org.example.designpattern.strategy.shopping.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(200, "成功"),

    FAIL(400, "失败");

    private final int code;

    private final String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
