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
public class Demo1 {
    public static void main(String[] args) {
        FilterManager fm = new FilterManager(new Task());
        fm.setFilter(new LogFilter());
        fm.setFilter(new AuthFilter());
        
        fm.execute("messages");
    }
}
