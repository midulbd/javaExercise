/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author Redwana
 */
public class NestedLoop {
    public static void main (String args []){
        int x,y;
        for (x = 0; x<10; x++)
        {
            for (y = x; y<10; y++)
                System.out.print("1");
            System.out.println();
        }
    }
    
}
