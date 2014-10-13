/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise.gfName;

import java.util.Scanner;

public class Gf {
    public static void main (String args[])
        {
            Scanner input = new Scanner(System.in);
            Tuna objGf = new Tuna();
            
            System.out.println("Enter your first gfs name :");
            String temp = input.nextLine();
            
            objGf.setName(temp);
            objGf.saying();
            
        }
    
}
