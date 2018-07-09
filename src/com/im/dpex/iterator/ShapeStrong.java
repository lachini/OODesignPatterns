/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.iterator;

/**
 *
 * @author Dell
 */
class ShapeStrong {

    private Shape[] shapes = new Shape[4];
    private int index = 0;

    void add(Shape shape) {
        shapes[index] = shape;
        index++;
    }
    
    public Shape [] getShapes(){
        return shapes;
    }
}
