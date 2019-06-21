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
public class OverridingConstructorTest {

    static public void test() {
        SubClass sub = new SubClass();
    }
}

class SuperClass {

//    public SuperClass(int m) {
//    }
    public SuperClass() {
        System.out.println("Default constructor of superclass is constructed!");
    }
}

class SubClass extends SuperClass {
    int i, j, k;
//    public SubClass(int m, int n) {
//        i = m;
//        j = m;
//    } //1
//
//    public SubClass(int m) {
//        super(m);
//    }
//    public SubClass() {
//        System.out.println("Default constructor of subclass is constructed!");
//    }
}
