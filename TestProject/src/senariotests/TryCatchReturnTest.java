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

    public static void test() {

        try {
            RuntimeException re = null;
//          RuntimeException re = new RuntimeException();
            throw re;
        } catch (Exception e) {
            System.out.println(e);
//        } catch (RuntimeException e) {
//            System.out.println(e);
//        }
//    
        }
    }
}
