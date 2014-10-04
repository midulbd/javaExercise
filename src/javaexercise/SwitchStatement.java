/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String args[])
        {
            Scanner getAge = new Scanner(System.in);
            String fruits;
            
            System.out.println("Enter your age");
            fruits= getAge.next();
            
            switch (fruits)
            {
                case "apple":
                    System.out.println("still gotta wait for one year");
                    break;
                    
                case "ornge":
                    System.out.println("you in time");
                    break;
                default:
                    System.out.println("not valid");
            }
            
        }
    
}
