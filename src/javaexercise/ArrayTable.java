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
public class ArrayTable {
    public static void main(String[] args) {
        System.out.println("index\tvalue");
        
        int value[]={12,123,1234,12345,1234156,1234567,1325465456};
        for (int counter=0; counter<value.length;counter++){
            System.out.println(counter+"\t"+value[counter]);
        }
        
        
    }
    
}
