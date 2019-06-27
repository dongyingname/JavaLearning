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
public class BitwiseOperatorTest {

    static public void test() {
        System.out.println("Bitwise AND &:");
        System.out.println("true & true:" + (true & true));
        System.out.println("true & false:" + (true & false));
        System.out.println("flase & true:" + (false & true));
        System.out.println("false & false:" + (false & false));
        
        
        System.out.println("\nBitwise OR |:");
        System.out.println("true | true:" + (true | true));
        System.out.println("true | false:" + (true | false));
        System.out.println("flase | true:" + (false | true));
        System.out.println("false | false:" + (false | false));
       
        System.out.println("\nBitwise XOR ^:");
        System.out.println("true ^ true:" + (true ^ true));
        System.out.println("true ^ false:" + (true ^ false));
        System.out.println("flase ^ true:" + (false ^ true));
        System.out.println("false ^ false:" + (false ^ false));

    }
}
