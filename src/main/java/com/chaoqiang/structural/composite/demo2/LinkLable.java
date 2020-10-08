package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:49
 **/
public class LinkLable extends WindowComponent {

    private String name;

    public LinkLable(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print LinkLable(" + name + ")");
    }
}
