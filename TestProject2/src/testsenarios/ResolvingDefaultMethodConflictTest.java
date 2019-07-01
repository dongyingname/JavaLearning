/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenarios;

/**
 *
 * @author yingd
 */
public class ResolvingDefaultMethodConflictTest implements Inter1, Inter2{
    
    @Override
    public void greet(){
        
    }
    static void test(){
    }
    
    
}

interface Inter1{
    default void greet(){
        System.out.println("Inter1 says Hello!");
    }
}


interface Inter2{
    default void greet(){
        System.out.println("Inter2 says Hello!");
    }
}