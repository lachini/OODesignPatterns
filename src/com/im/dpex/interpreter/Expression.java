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
public interface Expression {

    public double interpret(Map<String, Expression> variableMap);

}
