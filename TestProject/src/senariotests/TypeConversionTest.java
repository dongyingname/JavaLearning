/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

import java.util.ArrayList;
import java.lang.Object;

/**
 *
 * @author yingd
 */
public class TypeConversionTest {

    static public void test() {
//        Short k = 9;
//        Integer i = 9;
        short k = 9;
        int i = 9;
        System.out.println(k == i);

        var student = new Student();
        var allStudents = new ArrayList<Student>();
        allStudents.add(student);
        Student s2 = allStudents.get(0);

        var c = new Object[4];
        c[1] = 2;
        c[0] = "hahaa";
        boolean b1 = true;
        boolean b2 = true;
       for (;k<20;k++){
           if (k == 15) break;
           continue;
       }
               System.out.println("k:" + k);
    }
     

}
