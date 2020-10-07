package com.chaoqiang.structural.composite.try1;

/**
 * @author chaoqiang
 * @date 2020-10-07 17:18
 **/
class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
