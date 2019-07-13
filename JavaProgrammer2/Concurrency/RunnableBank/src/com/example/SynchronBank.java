/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author yingd
 */
public class SynchronBank {
    private var lock = new Object();
    private final double[] accounts;

    public SynchronBank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int from, int to, double amount)
            throws InterruptedException {

        while (accounts[from] < amount) {
            wait();
        }
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("%10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total balance: %10.2f%n", getTotalBalance());
        notifyAll();
    }

    public double getTotalBalance() {
       
            double sum = 0;
            for (double a : accounts) {
                sum += a;
            }
            return sum;
       
    }

    public int size() {
        return accounts.length;
    }
    
    public static void test(){
        
    }
}
