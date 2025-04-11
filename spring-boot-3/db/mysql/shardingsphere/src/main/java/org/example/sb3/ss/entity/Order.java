package org.example.sb3.ss.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {

    private Long orderId;

    private Integer userId;

    private Long addressId;

    private String status;

}
