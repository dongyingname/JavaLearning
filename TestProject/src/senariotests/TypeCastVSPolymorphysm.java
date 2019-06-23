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
        Employee a = new Employee();
        Employee b = new Manager();

//        ((Manager) a).bonus();
        System.out.println("Employee:");
        System.out.println(a.title);

        System.out.println(a.bonus());
        System.out.println("Manager:");
        System.out.println(((Manager) b).title);
        System.out.println(b.bonus());
    }
}

class Employee {

    String title = "Employee";

    public int bonus() {
        return 3000;
    }
}

class Manager extends Employee {

    String title = "Manager";

    public int bonus() {
        return 6000;
    }
}
