/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise;

import java.util.Scanner;

public class Apple {
    public static void main(String args[])
        {
            Scanner inputCarname = new Scanner(System.in);
            Car toyota = new Car ();
            
            System.out.println("Enter your Car name: ");
            String name = inputCarname.nextLine();
            
            toyota.simpleMessage(name);
        }
    
}
