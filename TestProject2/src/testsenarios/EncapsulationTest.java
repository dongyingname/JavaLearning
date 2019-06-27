/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenarios;

import java.util.ArrayList;

/**
 *
 * @author yingd
 */
public class EncapsulationTest {

    private ArrayList<Integer> scores = new ArrayList<>();
    private double average;

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public double getAverage() {
        return average;
    }

    private void computeAverage() {
        //valid code to compute average
  
    }

    public void Student() {
        computeAverage();
    }

    static public void test() {
        EncapsulationTest e =  new EncapsulationTest();
//        e.getScores() = new ArrayList<Integer>();
        (e.getScores()).add(50);
        System.out.println(e.getScores());
        
    }
}
