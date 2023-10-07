/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhatsang.mathutil.main;

import com.nhatsang.mathutil.core.MathUtility;

/**
 *
 * @author nhats
 */
public class Main {
    public static void main(String[] args) {
        //test thu ham vua viet co dung ko
        //chuan bi bo data test: TEST CASE
        
        //TEST CASE 1: CHECK IF getfactorial run well with n=0
        
        //Test Procedures/Steps:
        //          given n = 0;
        //          invoke getFactorial(n=0)
        
        //Expected Result: 1 // 0! == 1???
        
        long expected = 1 ;     /// hi vong tra ve
        int n = 0;              ///neu dua vao 0!
        long actual = MathUtility.getFactorial(0);        ///chay moi biet
        
        System.out.println(n+"! | expected = " + expected + 
                "| actual = " +actual);
        ///in ra ket qua co giong ki vong hay ko
        
        
        
        
        //TEST CASE 2: CHECK IF getfactorial run well with n = 1
        
        //Test Procedures/Steps:
        //          given n = 0;
        //          invoke getFactorial(n=0)
        
        //Expected Result: 1 // 0! == 1???
        
        
        System.out.println("1! | expected = 1" + 
                "| actual = " + MathUtility.getFactorial(1));
    }
}

    
    

