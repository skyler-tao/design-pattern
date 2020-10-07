package com.chaoqiang.structural.composite.old;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.Iterator;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:38
 **/
public class Waitress {

    private Menu pancakeHouseMenu;

    private Menu dinerMenu;

    private Menu cafeMenu;

    Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        printMenu(pancakeIterator);
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(dinerIterator);
        Iterator cafeIterator = cafeMenu.createIterator();
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVegetarianMenu() {

    }

    public Boolean isItemVegetarian(String name) {
        return null;
    }
}
