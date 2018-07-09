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
public class GameContext {

    private PlayerState state = null;
    private Player player = new Player();

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void gameAction() {
        state.action(player);
    }
}
