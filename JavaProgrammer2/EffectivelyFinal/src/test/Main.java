/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.function.UnaryOperator;

/**
 *
 * @author yingd
 */
public class Main {
    
    public static void main(String[] args) {
        
        String val1 = "hello";
        val1 = val1+"haha";
        StringBuilder val2 = new StringBuilder("world");
        
        UnaryOperator<String> uo1 = s1 -> s1.concat(val1); //1         
        UnaryOperator<String> uo2 = s -> s.toUpperCase(); //2         
//        System.out.println(uo1.apply(uo2.apply(val2))); //3
        System.out.println(uo2.apply(val1));
    }
}
