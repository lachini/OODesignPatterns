/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Calculator cal = new Calculator();
        String command = null;
        while (true) {
            System.out.println("Enter expression: ");
            command = sc.readLine();
            cal.parse(command).calculate();
            System.out.println("----------------------------------------------");
        }
    }
}
