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
public class Player {

    public void attack() {
        System.out.println("Attack");
    }

    public void fireBumb() {
        System.out.println("Fire Bomb");
    }

    public void fireGunblade() {
        System.out.println("Fire Gunblade");
    }

    public void fireLaserPistol() {
        System.out.println("Laser Pistols");
    }

    public void firePistol() {
        System.out.println("Fire Pistol");
    }

    public void survive() {
        System.out.println("Surviving!");
    }

    public void dead() {
        System.out.println("Dead! Game Over");
    }
}
