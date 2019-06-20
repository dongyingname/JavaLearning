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
public class SwitchTest {
    static   public int i = 5;
    static public void test() {
        switch (i) {
            case 5:
                System.out.println(5);
            case 4:
                System.out.println(4);
            default:
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
        }
    }
}
