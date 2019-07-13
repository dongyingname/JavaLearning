/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

/**
 *
 * @author yingd
 */
public class Main {

    public static List<String> strings = List.of("age", "some", "great", "agree",
            "slogan", "trash", "bean", "basketball", "brown", "quick");
//    public static Stream<String> strings2 = Stream.of("age", "some", "great", "agree",
//            "slogan", "trash", "bean", "basketball", "brown", "quick");

    public static void main(String[] args) {

        //Counting occurrances
        Map<Character, Integer> stringCountsByStartingLetter = strings.stream()
                .collect(groupingBy(s -> s.charAt(0),
                        collectingAndThen(toSet(), Set::size)));
        Map<Character, Long> stringCountsByStartingLetter2 = strings.stream()
                .collect(groupingBy(s -> s.charAt(0),
                        counting()));
        System.out.println(stringCountsByStartingLetter);
        System.out.println(stringCountsByStartingLetter2);
        
        //counting length
        Map<Character, Set<Integer>> stringLengthByStartingLetter = strings.stream()
                .collect(groupingBy(s -> s.charAt(0),
                        mapping(String::length, toSet())));
        System.out.println(stringLengthByStartingLetter);
        
        
    }
}
