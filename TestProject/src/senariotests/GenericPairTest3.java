/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senariotests;

/**
 *
 * @author yingd
 */
public class GenericPairTest3 {
    static public void test(){
        var ceo = 
    }
}

class PairAlg{
    public static boolean hasNulls(Pair<?> p){
        return p.getFirst() == null || p.getSecond() == null;
    }
    
    public static void swap(Pair<?> p){
        swapHelper(p);
    }
    
    public static <T> void swapHelper(Pair<T> p){
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
