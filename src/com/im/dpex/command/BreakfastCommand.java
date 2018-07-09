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
public class BreakfastCommand implements Command {

    Breakfast bf;

    public BreakfastCommand(Breakfast bf) {
        this.bf = bf;
    }

    @Override
    public void execute() {
        bf.makeBreakfast();
    }

}
