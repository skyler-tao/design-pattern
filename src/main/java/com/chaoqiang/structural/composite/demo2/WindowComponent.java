package com.chaoqiang.structural.composite.demo2;

/**
 * @author chaoqiang
 * @date 2020-10-08 10:31
 **/
abstract class WindowComponent {

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void addComponent(WindowComponent component) {
        throw new UnsupportedOperationException();
    }
}
