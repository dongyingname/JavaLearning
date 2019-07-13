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
public class MultiThreadsBankTest {

    public static final int DELAY = 10;
    public static final int STEPS = 100;
    public static double MAX_AMOUNT = 1000;

    public static void test() {
        var bank = new Bank(4, 100000);
        Runnable task1 = ()
                -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(0, 1, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };
        Runnable task2 = ()
                -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(2, 3, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
    }
}
