/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author yingd
 */
public class GenericOverrideTest {

}

class Base {

    public <T> Collection<T> transform(Collection<T> list) {
        return new ArrayList<T>();
    }
}

class Derived extends Base {

    public <T> Collection<T> transform(Collection<T> list) {
        return new HashSet<T>();
//        return new HashSet<String>();

    }
}
