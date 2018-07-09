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
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String regNo;
    private boolean isFemale;
    
    public Student(String fName,String lName,int age,String regNo,boolean isFemale){
        firstName=fName;
        lastName=lName;
        this.age=age;
        this.regNo=regNo;
        this.isFemale=isFemale;
    }
    
    public String display(){
        String gender;

        if (isFemale == true) {
            gender = "Female";
        } else {
            gender = "Male";
        }
        return (this.firstName+" "+this.lastName+" is a "+this.age+" years old "+gender+" student who registered as "+regNo+" .");
    }
}
