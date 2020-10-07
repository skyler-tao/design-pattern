package com.chaoqiang.structural.composite.old;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void remove() {
        throw new RuntimeException("not support remove");
    }
}
