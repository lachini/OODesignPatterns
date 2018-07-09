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
public class BubbleSort extends Algorithm {

    private int[] numbers;

    ;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void initiate() {
        System.out.println("Bubble sort initializing.....");
    }

    @Override
    public void sorting() {
        int n = this.numbers.length;
        int temp = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i - 1] > numbers[i]) {
                int swap = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = swap;
                temp = i;
            }
        }
    }

    @Override
    public void printResult() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
