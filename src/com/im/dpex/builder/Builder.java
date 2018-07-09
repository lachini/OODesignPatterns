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
public class Builder {
    
    private String firstName;
    private String lastName;
    private int age;
    private String regNo;
    private boolean isFemale;

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setRegNo(String regNo) {
        this.regNo = regNo;
        return this;
    }

    public Builder setIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
        return this;
    }
    
    
    
    public Student createStudent(){
       return new Student(firstName,lastName,age,regNo,isFemale); 
    }
}
