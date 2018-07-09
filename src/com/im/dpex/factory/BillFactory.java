/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.factory;

/**
 *
 * @author Nadun Shyn
 */
public class BillFactory {
    public static Bill createBill(String type){
        if(type==null){
            return null;
        }
        if(type.equals("DOMESTIC")){
            return new DomesticBill();
        }else if(type.equals("BUSINESS")){
            return new BusinessBill();
        }else if(type.equals("INDUSTRIAL")){
            return new IndustrialBill();
        }else{
            return null;
        }
    }
}
