/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author yingd
 */
public class CountRunnable implements Runnable{
    final int count;
    final String threadName;

    public CountRunnable(int count, String name) {
        this.count = count;
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println("Thread " + threadName + ": "
                    + i);
        }
    }

}
