/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.singleton;

/**
 *
 * @author Nadun Shyn
 */
public class Demo {
    public static void main(String[] args) {
        Wife w1 = Wife.getInstance();
        w1.setName("Seetha");
        
        
        Wife w2 = Wife.getInstance();
        w2.setName("Juliet");
        
        System.out.println("Wife 1 = "+w1.getName());
        System.out.println("Wife 2 = "+w2.getName());
        
        
        
    }
}
