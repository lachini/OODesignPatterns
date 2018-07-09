/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.factory;

/**
 *
 * @author Nadun Shyn
 */
public abstract class Bill {
    public abstract double getRate();
    
    public double getAmount(int start, int end){
        double amount = (end-start) * getRate();
        return amount;
    }
    
}
