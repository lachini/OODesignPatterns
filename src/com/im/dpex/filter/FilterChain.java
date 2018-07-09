/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nadun Shyn
 */
public class FilterChain {
    private List<Filter> filters = 
            new ArrayList<Filter>();
    private Task task;
    public void addFilter(Filter filter){
        filters.add(filter);
    }
    public void setTask(Task task){
        this.task = task;
    }
    
    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        task.execute(request);
    }
    
}
