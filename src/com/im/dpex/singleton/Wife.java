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
public class Wife {
    private String name ;
    
    private static Wife wife;
    
    private Wife(){
        
    }
    
    public static Wife getInstance(){
        if(wife==null){
            wife = new Wife();
        }
        return wife;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
