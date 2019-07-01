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
public class FinalStaticFieldTest {

    public static void test() {

    }
}

class Widget {

    static int MAX;     //1
    static final String CLASS_GUID;   // 2
   final String GREAT;   // 2

    static {
        CLASS_GUID = "hahah";
    }

    public Widget(String a) {
      GREAT ="HAHA";  
    }

}
