/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Dell
 */
public class Calculator {

    private Stack<Expression> stack = null;
    private Map<String, Expression> variableMap = null;
    private StringBuffer variableExpression = null;

    public Calculator parse(String expression) {
        variableMap = new HashMap<String, Expression>();
        variableExpression = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer(expression, " ");
        int i = 0;
        String token = null;
        while (stringTokenizer.hasMoreTokens()) {
            token = stringTokenizer.nextToken();
            if ((!token.equals("+")) && (!token.equals("-")) && (!token.equals("*")) && (!token.equals("/"))) {
                variableExpression.append("x" + i + " ");
                variableMap.put("x"+i++, new NumberExpression(Double.valueOf(token)));
            } else {
                variableExpression.append(token + " ");
            }
        }

        return this;
    }

    public double calculate() {
        stack = new Stack<Expression>();
        StringTokenizer stringTokenizer = new StringTokenizer(variableExpression.toString(), " ");
        String token = null;
        while (stringTokenizer.hasMoreTokens()) {
            token = stringTokenizer.nextToken();
            if (token.equals("+")) {
                stack.push(new AddExpression(stack.pop(), stack.pop()));
            } else if (token.equals("-")) {
                stack.push(new SubstractionExpression(stack.pop(), stack.pop()));

            } else if (token.equals("*")) {
                stack.push(new MultiplyExpression(stack.pop(), stack.pop()));

            } else if (token.equals("/")) {
                stack.push(new DivideExpression(stack.pop(), stack.pop()));

            } else {
                stack.push(new VariableExpression(token));
            }

        }
        return stack.pop().interpret(variableMap);
    }
}
