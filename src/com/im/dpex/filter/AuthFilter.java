/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.filter;

/**
 *
 * @author Nadun Shyn
 */
public class AuthFilter implements Filter{

    @Override
    public void execute(String request) {
        System.out.println("Authentication >>"+request);
    }
    
}
