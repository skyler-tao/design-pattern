package com.chaoqiang.behavior.iterator.demo1.try1;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.ArrayList;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:54
 **/
public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList items;

    private int position;

    PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position += 1;
        return menuItem;
    }
}
