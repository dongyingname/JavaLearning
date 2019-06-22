/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author yingd
 */
public class GenericPairClassTest2 {

    static public void test() {
        LocalDate[] birthdays = {
            LocalDate.of(1906, 12, 9),
            LocalDate.of(1815, 12, 10),
            LocalDate.of(1903, 12, 3),
            LocalDate.of(1910, 6, 22)
        };

        Pair<LocalDate> mm = ArrayAlg2.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

    }
}

class ArrayAlg2 {

    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (T a1 : a) {
            if (min.compareTo(a1) > 0) {
                min = a1;
            }
            if (max.compareTo(a1) < 0) {
                max = a1;
            }
        }
        return new Pair<>(min, max);

    }
}
