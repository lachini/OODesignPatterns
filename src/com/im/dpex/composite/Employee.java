/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.composite;

/**
 *
 * @author Dell
 */
public class Employee implements IEmployee{
    private String name;
    private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
    
    @Override
    public void getDetails() {
       System.out.println("Name:"+getName()+" , Department:"+getDept());
    }
    
}
