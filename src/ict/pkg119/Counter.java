/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ict.pkg119;

/**
 *
 * @author User
 */
public class Counter {
    private int count = 0;
    
    public synchronized int increment(){
        count++;
        return count;
    }
}
