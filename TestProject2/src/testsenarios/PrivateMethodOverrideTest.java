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
public class PrivateMethodOverrideTest {

    public static void test() {

    }
}

class ClassA {

    private void fun() {
        System.out.println("Base fun");
    }
}

class ClassB extends ClassA {

    private void fun() {
        System.out.println("Derived fun");
    }

    public void test() {
        ClassA obj = new ClassB();
        ((ClassB) obj).fun();
    }
}
