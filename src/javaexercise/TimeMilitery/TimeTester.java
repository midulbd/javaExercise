/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercise.TimeMilitery;

/**
 *
 * @author ASHIQUL
 */
public class TimeTester {
    public static void main (String args[])
    {
        Time outputTime = new Time();
        outputTime.setTime(24, 54, 55);
        System.out.println(outputTime.toMilitary());
    }
    
}
