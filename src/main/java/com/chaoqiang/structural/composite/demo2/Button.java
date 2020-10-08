package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:34
 **/
public class Button extends WindowComponent {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print Button(" + name + ")");
    }
}
