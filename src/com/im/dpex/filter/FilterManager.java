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
public class FilterManager {
    FilterChain filterChain;
    
    public FilterManager(Task task){
        filterChain = new FilterChain();
        filterChain.setTask(task);
    }
    
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    
    public void execute(String request){
        filterChain.execute(request);
    }
    
}
