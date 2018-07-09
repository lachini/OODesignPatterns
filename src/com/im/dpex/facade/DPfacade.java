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
public class DPfacade {

    private DesignPatterns decoratorPattern;
    private DesignPatterns factoryPattern;
    private DesignPatterns proxyPattern;

    public DPfacade() {
        this.decoratorPattern = new DecoratorPattern();
        this.factoryPattern = new FactoryPattern();
        this.proxyPattern = new ProxyPattern();
    }

    public void decoratorPattern() {
        decoratorPattern.designing();
    }

    public void factoryPattern() {
        factoryPattern.designing();
    }

    public void proxyPattern() {
        proxyPattern.designing();
    }

}
