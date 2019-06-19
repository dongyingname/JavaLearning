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
public class UnknownTypeArrayListTest {

    public static void test() {
        var student = new Student();
        var allStudents = new ArrayList<>();
        allStudents.add(student);
        Student s2 = (Student)allStudents.get(0);
        //if no casting occurs .get returns unknow type, i.e Object
        System.out.println(s2.name);

    }
}

class Student {
    public String name = "Student";
}
