package com.chaoqiang.behavior.iterator.demo1.try1;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:38
 **/
public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;

    private DinerMenu dinerMenu;

    Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        printMenu(pancakeIterator);
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(dinerIterator);
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
