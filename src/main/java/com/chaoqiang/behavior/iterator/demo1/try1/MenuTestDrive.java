package com.chaoqiang.behavior.iterator.demo1.try1;

/**
 * @author chaoqiang
 * @date 2020-10-07 16:02
 **/
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
