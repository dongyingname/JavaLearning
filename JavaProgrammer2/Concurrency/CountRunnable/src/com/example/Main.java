/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author yingd
 */
public class Main {

    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();

        es.submit(new CountRunnable(20, "A"));
        es.submit(new CountRunnable(20, "B"));
        es.submit(new CountRunnable(20, "C"));

        es.shutdown();
    }

}
