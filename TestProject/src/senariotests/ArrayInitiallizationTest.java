/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

import java.util.Arrays;

/**
 *
 * @author yingd
 */
public class ArrayInitiallizationTest {

    static public void test() {
        char cA[][] = new char[3][];
        for (int i = 0; i < cA.length; i++) {
            cA[i] = new char[4];
        }
        System.out.println(Arrays.toString(cA));
    }
}
