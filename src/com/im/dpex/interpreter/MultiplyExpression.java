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
public class MultiplyExpression implements Expression {

    Expression leftExpression;
    Expression rightExpression;

    public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double interpret(Map<String, Expression> variableMap) {
        double returnValue = leftExpression.interpret(variableMap) * rightExpression.interpret(variableMap);
        System.out.println(leftExpression + "*" + rightExpression + " = " + returnValue);
        return returnValue;
    }

    @Override
    public String toString() {
        return "(" + leftExpression.toString() + "*" + rightExpression.toString() + ")";
    }

}
