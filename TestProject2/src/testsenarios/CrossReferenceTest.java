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
public class CrossReferenceTest {
    
}


class A{
    B b = new B();
    
}

class B{
    A a = new A();
    LocalAndVariableNamingTest c = new LocalAndVariableNamingTest();
}