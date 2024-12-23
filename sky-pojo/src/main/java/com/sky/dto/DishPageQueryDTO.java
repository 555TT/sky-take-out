package com.sky.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class DishPageQueryDTO implements Serializable {

    private int page;

    private int pageSize;

    private String name;

    private Integer categoryId;

    /**
     * 状态 0表示禁用 1表示启用
     */
    private Integer status;

}
