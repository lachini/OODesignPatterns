/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.interpreter;

import java.util.Map;

/**
 *
 * @author Dell
 */
public class NumberExpression implements Expression {
    
    private double number;
    
    public NumberExpression(double number) {
        this.number = number;
    }
    
    
    public String toString() {
        return String.valueOf(number);
    }
    
    @Override
    public double interpret(Map<String, Expression> variableMap) {
        return number;
    }
    
}
