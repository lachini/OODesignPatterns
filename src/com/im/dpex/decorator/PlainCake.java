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
public class PlainCake implements Cake{

    @Override
    public String getDescription() {
        return "Butter Cake";
    }

    @Override
    public double getCost() {
        return 350.00;
    }
    
}
