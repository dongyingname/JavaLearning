/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenariopackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author yingd
 */
public class LinkedListTest {

    public static void test() {
        
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator aIter  = a.listIterator();
        Iterator bIter = b.iterator();
        while(bIter.hasNext()){
            if (aIter.hasNext());
            aIter.add(bIter.next());
        }
        System.out.println(a);
        
        bIter = b.iterator();
        while(bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);
        
        a.removeAll(b);
        System.out.println(a);

    }
}
