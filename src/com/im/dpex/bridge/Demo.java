/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.bridge;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("Enter the colour you want with icing : 'White' or 'Brown'");
        Scanner sc = new Scanner(System.in);
        String colour = sc.next();
        System.out.println("Colour : " + colour);

        Cake butterCake = new ChocolateCake();
        butterCake.makeIt();
        Cake chocoCake = new ButterCake();

        if ("brown".equalsIgnoreCase(colour)) {

            butterCake.setColour(new BrownIcingColour());
            butterCake.colourApply();

            chocoCake.setColour(new BrownIcingColour());
            chocoCake.colourApply();
        } else if ("white".equalsIgnoreCase(colour)) {
            butterCake.setColour(new WhiteIcingColour());
            butterCake.colourApply();

            chocoCake.setColour(new WhiteIcingColour());
            chocoCake.colourApply();
        }
    }
}
