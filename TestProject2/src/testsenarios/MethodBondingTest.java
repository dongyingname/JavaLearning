/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenarios;

/**
 *
 * @author yingd
 */
public class MethodBondingTest {

    void probe(int... x) {
        System.out.println("In ...");
    }  //1

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(long x) {
        System.out.println("In long");
    } //3 

    void probe(Long x) {
        System.out.println("In LONG");
    } //4

    static public void test() {
        Integer a = 4;
        new MethodBondingTest().probe(a); //5

        int b = 4;
        new MethodBondingTest().probe(b); //5

    }
}
//To answer this type of questions, you need to know the following rules: 
//1. The compiler always tries to choose the most specific method available with least number of modifications to the arguments.  
//2. Java designers have decided that old code should work exactly as it used to work before boxing-unboxing functionality became available.  
//3. Widening is preferred to boxing/unboxing (because of rule 2), which in turn, is preferred over var-args.   
//Thus, 
//1. probe(Integer) will be bound to probe(Integer) (exact match). If that is not available, it will be bound to probe(long), 
//and then with probe(int...) in that order of preference. probe(long) is preferred over probe(int...) because unboxing an Integer gives an int 
//and in pre 1.5 code probe(long) is compatible with an int (Rule 2).  It is never bound to probe(Long ) because Integer and Long are different object types
//and there is no IS-A relation between them. (This holds true for any two wrapper classes). It could, however, be bound to probe(Object ) (if it existed), 
//because Integer IS-A Object.  
//2. probe(int) is bound to probe(long) (because of Rule 2) , then to probe(Integer ) because boxing an int qives you an Integer, 
//which matches exactly to probe(Integer), and then to probe(int...).  It is never bound to probe(Long ) because int is not compatible with Long.   