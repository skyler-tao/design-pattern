package com.chaoqiang.structural.composite.demo1.try2;

import java.util.Iterator;

/**
 * @author chaoqiang
 * @date 2020-10-07 17:56
 **/
public class NullIterator implements Iterator {

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
