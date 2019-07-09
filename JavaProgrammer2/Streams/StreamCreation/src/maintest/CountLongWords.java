/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest;

import java.util.List;
import java.io.*;

/**
 *
 * @author yingd
 */
public class CountLongWords {
    public static void main(String[] args) {
        List<String> words = List.of("12","22","11","124","1231","2","656");
        long count = 0 ;
        
        for (String w : words){
            if (w.length()>2){
                count++;
            }
        }
        System.out.println(count);
        count = words.stream().filter(w->w.length()>2).count();
        System.out.println(count);
    }
}
