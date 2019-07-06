/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.collections;

import java.time.*;
import java.util.*;
import static java.util.Map.entry;

/**
 *
 * @author yingd
 */
public class TestClass {

    public static void main(String[] args) {
        List<Integer> testList = List.of(1, 2, 4, 8, 16, 32);
//        testList.add(64);
//        testList.set(2, 0);

        testList = List.of(0);
        testList.forEach(x -> System.out.println(x + ","));
        System.out.println(" ");

        Map<String, MonthDay> testMap = Map.ofEntries(
                entry("Bologna Day", MonthDay.of(Month.JANUARY, 16)),
                entry("Opposite Day", MonthDay.of(Month.JANUARY, 13)),
                entry("Panic Day", MonthDay.of(Month.FEBRUARY, 9)),
                entry("Raymond Day", MonthDay.of(Month.MARCH, 20)),
                entry("Knight Day", MonthDay.of(Month.OCTOBER, 1))
        );

        testMap.forEach((key, value) -> System.err.println(key + ":" + value + ", "));

    }
}
