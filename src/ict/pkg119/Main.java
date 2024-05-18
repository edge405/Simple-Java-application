/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ict.pkg119;

import java.util.Optional;

/**
 *
 * @author User
 */
public class Main {
//    public static int i = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter count = new Counter();
        
        
        Thread thread2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Thread 2 prints the value " + count.increment());
            }
        });
        
        Thread thread1 = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("Thread 1 prints the value " + count.increment());
            }
            thread2.start();
        });
        
        thread1.start();
        
            
    }
}
