/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenariopackage;

import java.util.HashMap;

/**
 *
 * @author yingd
 */
public class MapTest {

    public static void test() {
        var staff = new HashMap<String, Employee>();
        staff.put("144-125-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        System.out.println(staff);
        
        staff.remove("567-24-2546");

        staff.put("456-62-5527", new Employee("Francesca Miller"));
    
        System.out.println(staff.get("157-62-7935"));
        staff.forEach((k,v) ->System.out.println("Key="+k + ",value=" + v.name));


    }
}

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

}
