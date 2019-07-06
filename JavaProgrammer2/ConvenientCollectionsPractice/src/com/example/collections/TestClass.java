/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.collections;

import java.util.*;

/**
 *
 * @author yingd
 */
public class TestClass {
    public static void main(String[] args) {
        List<Integer> testList=List.of(1,2,4,8,16,32);
//        testList.add(64);
//        testList.set(2, 0);
        
        testList=List.of(0);
        testList.forEach(x->System.out.println(x+","));
        System.out.println(" ");
    }
}
