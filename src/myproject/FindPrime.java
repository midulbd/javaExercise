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
import java.util.Scanner;
public class FindPrime {
    
    public static void main(String args[]) {
        int num ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number"); 
        num = input.nextInt();
        boolean isPrime = true;
        
            for(int i=2; i <= num/i; i++)
            {
                if((num % i) == 0)
                {
                isPrime = false;
                break;
                }
            }
        
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
    
