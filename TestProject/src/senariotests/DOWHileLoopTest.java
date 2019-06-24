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
public class DOWHileLoopTest {

    static public void test() {
        int var = 20, i = 0;
        do {
            while (true) {
                if (i++ > var) {
                    break;
                }
            }
        } while (i < var--);
        System.out.println(var);
    }
}
