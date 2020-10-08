package com.chaoqiang.structural.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:46
 **/
public class Frame extends WindowComponent {

    private List<WindowComponent> components = new ArrayList<WindowComponent>();

    private String name;

    public Frame(String name) {
        this.name = name;
    }

    @Override
    public void addComponent(WindowComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("print Frame(" + name + ")");
        for (WindowComponent component : components) {
            component.print();
        }
    }
}
