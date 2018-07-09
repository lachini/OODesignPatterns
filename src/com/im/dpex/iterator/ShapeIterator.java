/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.iterator;

import java.util.Iterator;

/**
 *
 * @author Dell
 */
class ShapeIterator implements Iterator<Shape> {

    private Shape[] shapes;
    private int index = 0;

    ShapeIterator(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        if (index >= shapes.length || shapes[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Shape next() {
        return shapes[index++];
    }

    @Override
    public void remove() {
        for (int i = 0; i < shapes.length - 1; i++) {
            shapes[i] = shapes[i + 1];
        }
        shapes[shapes.length - 1] = null;
    }

}
