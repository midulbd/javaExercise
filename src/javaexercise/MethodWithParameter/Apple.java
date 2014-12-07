/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise.MethodWithParameter;

import java.util.Scanner;

public class Apple {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        Tuna tunaObj = new Tuna();
        
        System.out.println("enter your name");
        String yourName = input.nextLine();
        
        tunaObj.simpleMessage(yourName);
        
    }
    
}
