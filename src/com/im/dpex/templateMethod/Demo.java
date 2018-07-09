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
public class Demo {

    public static void main(String[] args) {

        int[] numbers = {55, -10, 5, 4589};

        Algorithm bubbleSort = new BubbleSort(numbers);

        bubbleSort.sort();
        
        //Algorithm insertionSort = new BubbleSort(numbers);

        //insertionSort.sort();
    }
}
