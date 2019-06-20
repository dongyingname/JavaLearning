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
public class TypeCastVSPolymorphysm {

    static public void test() {
        Employee a = new Manager();
//        ((Manager) a).bonus();
            a.bonus();


    }
}
class Employee {

    public void bonus() {
        System.out.println("Employee's bonus is 6000");
    }
}
class Manager extends Employee {

    public void bonus() {
        System.out.println("Manager's bonus is 76000");
    }
}
