package com.chaoqiang.structural.composite.demo1.old;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.Iterator;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:30
 **/
class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;

    private Integer numberOfItems = 0;

    private MenuItem[] menuItems;

    DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "xxx", true, 1.99);
        addItem("Soup of the day", "yyy", true, 3.99);
        addItem("Hotdog", "zzz", false, 3.05);

    }

    private void addItem(String name, String description, Boolean vegetarian, Double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
