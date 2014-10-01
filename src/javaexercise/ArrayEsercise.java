/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise;

/**
 *
 * @author ASHIQUL
 */
public class ArrayEsercise {
    
    public static void main (String args[])
        {
            int array[] = new int[7];
            
            for (int count=0; count<7; count++)
                {
                    array[count]=count+1;
                }
            for (int count=0; count<7; count++)
                {
                    System.out.println ("array["+count+"] = "+array[count]);
                } 
        }
    
}
