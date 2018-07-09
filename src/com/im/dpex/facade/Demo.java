/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.facade;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String[] args) {
        DPfacade facade = new DPfacade();

        facade.decoratorPattern();
        facade.factoryPattern();
        facade.proxyPattern();
    }

}
