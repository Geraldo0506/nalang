/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity3;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Activity3 {

     public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       
       double celsius;
       double fahrenheit;
       
       System.out.print("Enter Celsius: ");
       celsius = scn.nextInt();
       
       fahrenheit = (celsius * 9/5) + 32;
       System.out.println("Celsius: " +celsius+"\n"+"Celsius to Fahrenheit: "+fahrenheit);
    }
}
