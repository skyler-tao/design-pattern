package com.chaoqiang.behavior.iterator.demo1.try1;

import com.chaoqiang.behavior.iterator.demo1.old.MenuItem;

/**
 * @author chaoqiang
 * @date 2020-10-07 15:49
 **/
public class DinerMenuIterator implements Iterator {
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
}
