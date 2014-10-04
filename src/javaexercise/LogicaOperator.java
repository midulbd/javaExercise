/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise;

import java.util.Scanner;

public class LogicaOperator {
    public static void main(String args[])
        {
            Scanner age = new Scanner(System.in);
            int boyAge, girlAge;
            System.out.println("Enter males age");
            boyAge = age.nextInt();
            System.out.println("Enter girls age");
            girlAge=age.nextInt();
            
            if (boyAge>16 && girlAge>16) 
            {
                System.out.println("valid to ge3t married");
                
            }
            else{System.out.println("not allowd to get married");}
        }
    
}
