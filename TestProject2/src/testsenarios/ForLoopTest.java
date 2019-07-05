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
public class ForLoopTest {

    static public void test() {
        int a = 0;
        int i = 0;

        for (i = 1; i < 5; i++) {
            a++;
            continue;
        }
        for (i = 0;; a++) {
            a++;
            break;       //(2)
        }
        for (; i < 5 ? false : true;) {
            a++;     //(3)
        }
        System.out.println("i: " + i);
        System.out.println("a: " + a);

    }
    public static int doIt() throws Exception {  throw new Exception("FORGET IT");  }
}
