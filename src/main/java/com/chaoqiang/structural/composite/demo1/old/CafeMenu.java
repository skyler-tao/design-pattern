package com.chaoqiang.structural.composite.demo1.old;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author chaoqiang
 * @date 2020-10-07 16:50
 **/
class CafeMenu implements Menu {

    private Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries 1", "aaaaa", true, 3.99);
        addItem("Veggie Burger and Air Fries 2", "bbbbb", false, 2.99);
        addItem("Veggie Burger and Air Fries 3", "ccccc", true, 4.99);
        addItem("Veggie Burger and Air Fries 4", "ddddd", false, 5.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
