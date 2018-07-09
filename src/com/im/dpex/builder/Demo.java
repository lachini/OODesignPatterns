/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.builder;

/**
 *
 * @author Dell
 */
public class Demo {
    public static void main(String[] args) {
        Builder builder = new Builder();
        
        builder.setFirstName("Venuka");
        builder.setLastName("Ashan");
        builder.setAge(24);
        builder.setIsFemale(false);
        builder.setRegNo("2015/CS/117");
        
        System.out.println(builder.createStudent().display());
    }
}
