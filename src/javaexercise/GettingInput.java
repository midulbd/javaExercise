
package javaexercise;

import java.util.Scanner;

public class GettingInput {
    public static void main(String args[])
        {
            Scanner inpt = new Scanner(System.in);
            double fnum, snum, total;
            
            System.out.println("enter your first number");
            fnum= inpt.nextDouble();
            System.out.println("enter your SEcond number");
            snum=inpt.nextDouble();
            total= fnum+snum;
            System.out.println("total number is \t"+total);
            
        }
      
}
