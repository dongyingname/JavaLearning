/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greeting;

import com.name.Names;
import com.question.Questions;

/**
 *
 * @author yingd
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello NetBeans!");
        System.out.println("Hello " + Names.getName());
        System.out.println("Hello " + Names.getName() + "! "
                + Questions.getQuestion());

    }

}
