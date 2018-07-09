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
public class ButterCake extends Cake {

    @Override
    void makeIt() {
        System.out.println("Butter Cake has been made without any icing colour.");
    }

    @Override
    void colourApply() {
        System.out.println("Butter Cake applying with icing colour ");
        colour.applyColour();
    }

}
