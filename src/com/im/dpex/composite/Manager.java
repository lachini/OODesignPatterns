/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Manager implements IEmployee{
    
    private String name;
    private String dept;
    
    ArrayList<IEmployee> employees;
    
    public Manager(String name, String dept) {
        this.name = name;
        this.dept = dept;
        employees=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
    
    
    @Override
    public void getDetails() {
        //System.out.println("Name:"+getName()+", Department:"+getDept());
        
        for(IEmployee emp:employees){
            emp.getDetails();
        }
    }
    
    public void addEmployee(IEmployee emp) {
        employees.add(emp);
    }
 
    public void removeEmployee(IEmployee emp) {
        employees.remove(emp);
    }
    
    
}
