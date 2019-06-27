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
public interface ConstructerOverrideTest {

    static public void test() {
        SubClass a = new SubClass(2);
    }
}

class SuperClass {

    SuperClass() {
        System.out.println("hahah");
    }

    public void print() {
        System.out.println("A");
    }
}  //In file B.java package b; import a.*; 

class SubClass extends SuperClass {

    SubClass() {
    }

    SubClass(int a){
        System.out.println("int: " + a); 
    }
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B();
    }
}
