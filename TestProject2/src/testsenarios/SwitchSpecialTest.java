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
public class SwitchSpecialTest {

    public static void test() {
        var s = "hel";
        switch (s) {
            default:
            case "Hello":
                System.out.println("case: Hello");
                
            case "hello":
                System.out.println("case: hello");
                break;
            
        }
     
    }
}
