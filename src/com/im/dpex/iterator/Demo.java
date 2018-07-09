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
public class Demo {

    public static void main(String[] args) {
        Shape rectangle = new Shape(1, "rectangle");
        Shape square = new Shape(2, "square");
        Shape circle = new Shape(3, "circle");
        Shape triangle = new Shape(4, "triangle");

        ShapeStrong shapeStrong = new ShapeStrong();
        shapeStrong.add(rectangle);
        shapeStrong.add(square);
        shapeStrong.add(circle);
        shapeStrong.add(triangle);

        //create an iterator to interate through this collection
        ShapeIterator iterator = new ShapeIterator(shapeStrong.getShapes());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            /*iterator.remove();*/
            //using this when run time, can remove the 1st and 3rd elements in array(shapes)
        }
    }
}
