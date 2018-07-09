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
public class HealthyState implements PlayerState {

    @Override
    public void action(Player p) {
        p.attack();
        p.fireBumb();
        p.fireGunblade();
        p.fireLaserPistol();
    }

}
