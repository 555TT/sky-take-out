package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrdersRejectionDTO implements Serializable {

    private Long id;

    /**
     * 拒绝原因
     */
    private String rejectionReason;

}
