package com.chaoqiang.structural.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaoqiang
 * @date 2020-10-08 11:30
 **/
public class Window extends WindowComponent {

    private List<WindowComponent> components = new ArrayList<WindowComponent>();

    public Window() {

    }

    public Window(List<WindowComponent> components) {
        this.components = components;
    }

    @Override
    public void addComponent(WindowComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("print WinForm(WINDOW窗口)");
        for (WindowComponent component : components) {
            component.print();
        }
    }
}
