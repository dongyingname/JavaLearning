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
public class TryCatchReturnTest {

    static String j = "";

    public static void testHelper(int i) {
        try {
            if (i == 2) {
                throw new Exception();
            }
            j += "1";
        } catch (Exception e) {
            j += "2";
//            return;
        } finally {
            j += "3";
        }
        j += "4";
    }

    public static void test() {
        testHelper(1);
        testHelper(2);
        System.out.println(j);
    }
}
