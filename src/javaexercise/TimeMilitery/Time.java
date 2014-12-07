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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public void setTime(int h,int m, int s)
    {
        hour = ((h>=0 && h<24) ? h : 0);
        minute = ((m>=0 && h<60) ? m : 0);
        second = ((s>=0 && s<60) ? s : 0);
    }
    
    public String toMilitary()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
