/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.visitor;

/**
 *
 * @author Dell
 */
public interface NumberElement {

    public void accept(NumberVisitor visitor);
}
