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
public class ArrySimpleAvrage {
    public static void main(String args[])
    {
        double num[]={10.1,11.2,12.3,13.4,14.5};
        double result=0;
        int i;
        
        for (i=0; i<5; i++){
            result=result + num[i];
        System.out.println("Averge is " + result/5);}
    }
        
    
    }

