/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.state;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String[] args) {
        GameContext context = new GameContext();

        context.setState(new HealthyState());
        context.gameAction();
        System.out.println("*****");

        context.setState(new SurvivalState());
        context.gameAction();
        System.out.println("*****");

        context.setState(new DeadState());
        context.gameAction();
        System.out.println("*****");
    }
}
