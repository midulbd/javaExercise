/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise.bankAccount;

/**
 *
 * @author ASHIQUL
 */
public class BankAccount {
    int id=01;
    String name="Ashiq";
    String address="dhaka";
    double balance=1000.00;
    
    public BankAccount(String name, int id, String address, double balance)
        {
            id=id;
            name = name;
            address = address;
            balance = balance;
        }  
    public int getId()
            {return id;}
    public String getName()
            {return name;}
    public double getbalance()
            {return balance;}
    
    
               
    
    
   
    
}
