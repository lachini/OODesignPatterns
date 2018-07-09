/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.bridge;

/**
 *
 * @author Dell
 */
public abstract class Cake {

    protected ColourFilter colour;

    public ColourFilter getColour() {
        return colour;
    }

    public void setColour(ColourFilter colour) {
        this.colour = colour;
    }
    
    abstract void colourApply();
    abstract void makeIt(); 

}
