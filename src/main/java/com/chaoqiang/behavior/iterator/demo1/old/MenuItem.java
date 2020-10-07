package com.chaoqiang.behavior.iterator.demo1.old;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 菜单对象
 *
 * @author chaoqiang
 * @date 2020-10-07 15:23
 **/
@Data
@AllArgsConstructor
public class MenuItem {

    /**
     * 名称
     */
    private String name;

    /**
     * 叙述
     */
    private String description;

    /**
     * 是否为素食
     */
    private Boolean vegetarian;

    /**
     * 价格
     */
    private Double price;
}
