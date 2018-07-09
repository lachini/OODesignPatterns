/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dpex.flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Shalini PC
 */
public class RectWorld extends JFrame{
    private ArrayList<Rect> rects = new ArrayList<>();

    public void plainRect(int x, int y, String name, Color color, String newRect) {
        RectType type = RectFactory.getRectTypes(name, color, newRect);
        Rect rect = new Rect(x, y, type);
        rects.add(rect);
    }

    //override method
    public void paint(Graphics graphics) {
        for (Rect rect : rects) {
            rect.draw(graphics);
        }
    }
}
