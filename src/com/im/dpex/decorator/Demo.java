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
public class Demo {
    public static void main(String[] args) {
        Cake basicCake=new Peanuts(new Icing(new PlainCake()));
        System.out.println("Ingredients: "+basicCake.getDescription());
        System.out.println("Price: "+basicCake.getCost());
        
    }
}
