package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 菜品
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 菜品名称
     */
    private String name;

    /**
     * 菜品分类ID
     */
    private Long categoryId;

    /**
     * 菜品价格
     */
    private BigDecimal price;

    /**
     * 图片路径或URL
     */
    private String image;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 菜品状态，0表示停售，1表示起售
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建用户ID
     */
    private Long createUser;

    /**
     * 更新用户ID
     */
    private Long updateUser;


}
