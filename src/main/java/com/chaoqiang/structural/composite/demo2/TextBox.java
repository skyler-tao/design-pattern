package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:47
 **/
public class TextBox extends WindowComponent {

    private String name;

    public TextBox() {

    }

    public TextBox(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        if (name != null) {
            System.out.println("print TextBox(" + name + ")");
        } else {
            System.out.println("print TextBox(文本框)");
        }
    }
}
