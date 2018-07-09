/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dpex.flyweight;

import java.awt.Color;

/**
 *
 * @author Shalini PC
 */
public class Demo {
    static int CANVAS_SIZE = 500;
    static int RECTS_TO_DRAW = 1000000;
    static int RECT_TYPES = 2;

    public static void main(String[] args) {
        RectWorld rectWorld = new RectWorld();
        for (int i = 0; i < Math.floor(RECTS_TO_DRAW / RECT_TYPES); i++) {
            rectWorld.plainRect(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.BLUE, "");
            rectWorld.plainRect(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.LIGHT_GRAY, "Autumn Oak texture stub");
        }
        rectWorld.setSize(CANVAS_SIZE, CANVAS_SIZE);
        rectWorld.setVisible(true);

        System.out.println(RECTS_TO_DRAW + " rects drawn");
        System.out.println("Total Memory Usage: " + ((RECTS_TO_DRAW * 8 + RECT_TYPES * 30) / 1024 / 1024)+"MB");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
