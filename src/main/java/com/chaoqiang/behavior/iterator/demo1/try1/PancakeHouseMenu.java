package com.chaoqiang.behavior.iterator.demo1.try1;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.ArrayList;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:26
 **/
class PancakeHouseMenu {

    private ArrayList menuItems;

    PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, Boolean vegetarian, Double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
