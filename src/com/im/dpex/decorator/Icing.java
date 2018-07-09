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
public class Icing extends Decorator{
    
    public Icing(Cake newCake) {
        super(newCake);
        
        System.out.println("Adding Butter");
        
        System.out.println("Adding Icing");
    }
    
    public String getDescription() {
        return newCake.getDescription() + ", ChocolateIcing";
    }

    public double getCost() {
        return newCake.getCost() + 50.00;
    }
    
}
