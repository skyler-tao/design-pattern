package com.chaoqiang.structural.composite.demo1.old;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

import java.util.Iterator;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:49
 **/
class DinerMenuIterator implements Iterator {
    private MenuItem[] items;

    private int position = 0;

    DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public void remove() {
        throw new RuntimeException("not support remove");
    }
}
