/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenariopackage;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author yingd
 */
public class LinkedListAddTest {

    public static void test() {
        var staff = new LinkedList<String>();
        staff.add("Bonnie");
        staff.add("John");
        staff.add("Kevin");
        staff.add("Lorie");
        staff.add("Tomas");
        Iterator<String> s = staff.iterator();
        String first = s.next();
        String second = s.next();
        s.remove();
        System.out.println(staff);

    }
}
