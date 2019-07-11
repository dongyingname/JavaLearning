/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author yingd
 */
public class HelloThread extends Thread {
    public void run(){
        System.out.println("Hello from a thread");
    }
    
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Avail CUPs: " + rt.availableProcessors());
        (new HelloThread()).start();
    
    }
}
