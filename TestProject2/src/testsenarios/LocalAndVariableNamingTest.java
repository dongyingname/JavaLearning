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
public class LocalAndVariableNamingTest {
    
    int var1;
    int var2;
    static int var3;

    
    static public void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+ " ");
        }
        for (int i = 10; i < 0; i--) {
            System.out.println(i+ " ");
        }
        var i =20;
        System.out.println(i + " ");
    }
    
    public void method1(int var1){
        var3++;
    }
    
    static public void method2(int var1){
        var3++;
    }
}
