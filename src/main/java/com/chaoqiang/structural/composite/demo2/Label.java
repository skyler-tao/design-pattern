package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:39
 **/
public class Label extends WindowComponent {

    private String name;

    public Label(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print Label(" + name + ")");
    }
}
