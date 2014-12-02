/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;




public class EnhancedForLoop {
    public static void main(String args[])
    {
        int numbers []= {1,2,3,4,5,6,7,8}; 
        int total = 0;
        
        for(int x : numbers)
        {
            System.out.println("value of x "+ x);
            total +=x;
        }
         
        
        System.out.println("toal is "+ total);
       
          int num []= {9,10,11,12,13,14,15}; 
          int sum = 0;
        
        for(int y : num)
        {
            System.out.println("value of y "+ y);
            total +=y;
            if ( y == 13) break;
        }
         
        
        System.out.println("toal is "+ total);
    }
    
    
    
}
