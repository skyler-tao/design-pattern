package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:33
 **/
public class Picture extends WindowComponent {

    private String name;

    public Picture(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print Picture(" + name + ")");
    }
}
