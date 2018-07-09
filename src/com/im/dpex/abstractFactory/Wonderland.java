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
public class Wonderland {

    public Wonderland(AnimalFactory factory) {
        Animal animal = factory.createAnimal();
        animal.breathe();
    }
}
