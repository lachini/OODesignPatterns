/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.decorator;

/**
 *
 * @author Dell
 */
public abstract class Decorator implements Cake{
    protected Cake newCake;
    
    public Decorator(Cake newCake){
        this.newCake=newCake;
    }
    
    public String getDescription(){
        return newCake.getDescription();
    }
    
    public double getCost(){
        return newCake.getCost();
    }
}
