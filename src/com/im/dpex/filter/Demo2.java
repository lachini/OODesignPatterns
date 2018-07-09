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
public class Demo2 {
    public static void main(String[] args) {
        FilterManager fm1 = new FilterManager(new Task());
        fm1.setFilter(new LogFilter());
        
        Client c1 = new Client();
        c1.setFilterManager(fm1);
        c1.sendRequest("home");
        
        
    }
}
