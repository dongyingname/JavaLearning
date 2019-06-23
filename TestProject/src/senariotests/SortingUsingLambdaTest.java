/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

import java.util.ArrayList;

/**
 *
 * @author yingd
 */
public class SortingUsingLambdaTest {
    static public void test(){
        var values = new ArrayList<String>();
        values.sort( (a, b)-> a.compareTo(b) );
    }
}
