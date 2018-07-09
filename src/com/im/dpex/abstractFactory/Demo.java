/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.abstractFactory;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String args[]) {
        new Wonderland(createAnimalFactory("water"));
    }

    public static AnimalFactory createAnimalFactory(String type) {
        if ("water".equals(type)) {
            return new SeaFactory();
        } else {
            return new LandFactory();
        }
    }
}
