/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.flyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dell
 */
public class RectType {
    private String name;
    private Color color;
    private String newRect;
    
    public RectType(String name,Color color,String newRect){
        this.name=name;
        this.color=color;
        this.newRect=newRect;
    }
    
    public void draw(Graphics g, int x, int y){
        g.setColor(color.BLACK);
        g.fillRect(x-1, y, 10, 10);
        g.setColor(color);
        g.fillRect(x-5, y-10, 10, 10);
    }
}
