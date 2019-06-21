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
public class BaapBetaCastTest {

    static public void test() {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}

class Baap {

    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

class Beta extends Baap {

    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }
}
