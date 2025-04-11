package org.example.sb3.ss.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItem implements Serializable {

    private Long orderItemId;

    private Long orderId;

    private Integer userId;

    private String status;

}
