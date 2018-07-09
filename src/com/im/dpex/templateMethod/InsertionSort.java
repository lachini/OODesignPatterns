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
public class InsertionSort extends Algorithm {

    private int[] numbers;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void initiate() {
        System.out.println("Insertion sort initializing.....");
    }

    @Override
    public void sorting() {
        int temp;
        int j;
        for (int i = 1; i < this.numbers.length; i++) {
            temp = this.numbers[i];
            j = i;

            while (j > 0 && numbers[j - 1] > temp) {
                numbers[j] = numbers[j - 1];
                j = j - 1;
            }
            numbers[j] = temp;
        }
    }

    @Override
    public void printResult() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
