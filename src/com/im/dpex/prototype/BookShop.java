/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class BookShop implements Cloneable{
    private String shopName;
    List<Book>books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" + "shopName = " + shopName + ", books=" + books + "};\n";
    }
    
    //fetching data from JDBC
   public void loadBooks(){
       for(int i=1;i<6;i++){
           Book b= new Book();
           b.setBookId(i);
           b.setBookName("Book"+i);
           getBooks().add(b);
           
       }
   }

    @Override
    //fetching data from old Object
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop=new BookShop();
        
        for(Book b: this.getBooks()){
            shop.getBooks().add(b);
        }
        return shop;
    }
   
   
    
}
