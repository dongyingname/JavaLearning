/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

/**
 *
 * @author yingd
 */
public class ArrayCastTest {

    static public void test() {
        A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;
        b = new B[20];
        a = b;  // 1       
        b = (B[]) a;  // 2       
        b = (B[]) a1; // 3
    }
}

class A {
}

class B extends A {
}
