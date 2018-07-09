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
public class VariableExpression implements Expression {

    private String symbol;

    public VariableExpression(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public double interpret(Map<String, Expression> variableMap) {
        double returnValue = 0;
        if (variableMap.get(symbol) != null) {
            returnValue = variableMap.get(symbol).interpret(variableMap);
        }
        System.out.println(symbol + " = " + returnValue);
        return returnValue;
    }

    public String toString() {
        return symbol;
    }
}
