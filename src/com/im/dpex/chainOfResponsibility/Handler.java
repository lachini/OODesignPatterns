/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.chainOfResponsibility;

/**
 *
 * @author Dell
 */
public abstract class Handler {

    public abstract void setHandler(Handler handler);

    public abstract void process(File file);

    public  abstract String getHandlerName();

}
