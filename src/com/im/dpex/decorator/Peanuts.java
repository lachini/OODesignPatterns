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
public class Peanuts extends Decorator {

    public Peanuts(Cake newCake) {
        super(newCake);

        System.out.println("Adding Peanuts");
    }

    public String getDescription() {
        return newCake.getDescription() + ", Peanuts with Peppermints";
    }

    public double getCost() {
        return newCake.getCost() + 150.00;
    }
}
