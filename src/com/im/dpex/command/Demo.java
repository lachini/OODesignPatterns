/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.command;

/**
 *
 * @author Dell
 */
public class Demo {
    public static void main(String[] args) {
        
        Breakfast bf=new Breakfast();//receiver        
        Command bfCommand = new BreakfastCommand(bf);//command
        
        Lunch lunch=new Lunch();//receiver
        Command lunchCommand=new LunchCommand(lunch);//command
        
        MealMaker mealMaker=new MealMaker(bfCommand);//invoker
        mealMaker.make();
        
        mealMaker.setCommand(lunchCommand);
        mealMaker.make();
    }
}
