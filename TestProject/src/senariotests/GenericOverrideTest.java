/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author yingd
 */
public class GenericOverrideTest {

}

class Base {

    public List<CharSequence> transform(Set<CharSequence> list) {       //valid code   }; 
        return new ArrayList();
    }
}

class Derived extends Base {

//    public List<String> transform(Set<String> list) {
//    }

}
