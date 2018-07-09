/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.prototype;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("PROMATE");
        bs.loadBooks();

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);//remove data from main Object(bs)
        bs1.setShopName("SIYAPATHA");
        
        System.out.println(bs);
        System.out.println(bs1);
    }
}
