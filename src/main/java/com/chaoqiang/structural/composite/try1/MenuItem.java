package com.chaoqiang.structural.composite.try1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chaoqiang
 * @date 2020-10-07 17:22
 **/
@Data
@AllArgsConstructor
class MenuItem extends MenuComponent {

    private String name;

    private String description;

    private boolean vegetarian;

    private double price;

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
