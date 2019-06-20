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
public class MainThrowsExceptionTest {

    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];

    public static void test() throws Exception {

        try {

            var x = false;
            if (b) {
                x = (ch == ia[ch]);
            } else {
                x = (ba[ch] = b);
            }
            System.out.println(x + " " + ba[ch]);
            throw new Exception();
        } catch (Exception e) {
            throw e;
        }
    }
}
