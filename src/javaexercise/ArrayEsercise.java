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
            
        
    
        
            int abc[]=new int[15];
            for (int count=7; count<15;count++)
                {
                    abc[count]=count+1;
                }
            for (int count=7;count<15; count++)
                {
                    System.out.println("array["+count+"]= "+abc[count]);
                }
            
            int xyz[]=new int[20];
            for (int count=15; count<xyz.length; count++)
                {
                    xyz[count]=count+1;
                    
                }
            for (int count=15; count<xyz.length; count++)
                {
                    System.out.println("xyz["+count+"]="+xyz[count]);
                }
            
            String tuna[]= new String[3];
             tuna[0]="tuna chunk";
             tuna[1]="tuna with tomato";
             tuna[2]="tuna in sunflower oil";
            
             System.out.println(tuna[1]);
        }
    
}
