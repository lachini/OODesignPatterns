/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.adapter;

/**
 *
 * @author Nadun Shyn
 */
public class Demo {
    public static void main(String[] args) {
        MyPlayer player = new MyPlayer();
        player.play("mp3", "Quit Playing.mp3");
        player.play("mp4", "Zunsara.pm4");
        player.play("avi", "F8.avi");
        
    }
}
