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
public class Search {
    public static void main(String args[]) {
int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
int val = 5;
boolean found = false;
// use for-each style for to search nums for val
for(int x : nums) {
if(x == val) {
found = true;
break;
}
}
if(found)
System.out.println("Value found!");

    int pages[] = {1,5,8,7,8,3,5,7,58,35,4,5,2,8,8,8,8};
    int expectedNumber = 10;
    boolean expectedFound = false;
    
    for(int y : pages)
    {
       if ( y == expectedNumber )
       {
           expectedFound = true;
           break;
       }
    }
    
    if (expectedFound) System.out.println("Expected nu,mbefound");
    else System.out.println("not found");
    
    
    }
    
}
