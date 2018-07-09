/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.templateMethod;

/**
 *
 * @author Dell
 */
public abstract class Algorithm {

    public abstract void initiate();

    public abstract void sorting();

    public abstract void printResult();

    public void sort() {
        initiate();
        sorting();
        printResult();
    }
}
