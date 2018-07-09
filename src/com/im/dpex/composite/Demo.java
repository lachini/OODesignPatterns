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
public class Demo {
    public static void main(String[] args) {
        IEmployee shalini=new Employee("Shalini","IT");
        IEmployee Kulani=new Employee("Kulani","IT");
    
        Manager manager=new Manager("Venuka","IT");
        manager.addEmployee(shalini);
        manager.addEmployee(Kulani);
        
        manager.getDetails();
    }
}
