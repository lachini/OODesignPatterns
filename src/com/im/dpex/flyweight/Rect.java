/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.flyweight;

import java.awt.Graphics;

/**
 *
 * @author Dell
 */
public class Rect {
    private int x;
    private int y;
    private RectType type;
    
    public Rect(int x, int y, RectType type){
        this.x=x;
        this.y=y;
        this.type=type;
    }
    
    public void draw(Graphics g){
        type.draw(g, x, y);
    }
}
