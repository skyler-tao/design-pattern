package com.chaoqiang.structural.composite.old;

/**
 * @author chaoqiang
 * @date 2020-10-07 16:02
 **/
public class MenuTestDrive {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
