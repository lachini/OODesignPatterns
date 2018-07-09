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
public class MealMaker {

    Command command;

    public MealMaker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void make() {
        command.execute();
    }
}
