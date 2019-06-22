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
public class IheritanceOverrideTest {

    public static void test() {
        Bang mc = new BigBang();
        System.out.println("mc.i= " + mc.i);
        System.out.println("BigBang.i= " + BigBang.i);
        ((BigBang) mc).k();
        System.out.println("mc.i= " + mc.i);
        System.out.println("BigBang.i= " + BigBang.i);
    }
}

abstract class Bang {
// abstract void f();  

    final void g() {
    }
// final    void h(){} 
    protected static int i;
    private int j;
}

final class BigBang extends Bang {
// BigBang(int n) { m = n; } // LINE 2    

// @Override // LINE 3    
    void h() {
    }

    void k() {
        i++;
    }
// void l(){ j++; }    
    int m;
}
