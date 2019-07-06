/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintestpackage;

import java.util.Comparator;

/**
 *
 * @author yingd
 */
public class StudentSortGpa implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        if(s1.getGpa() < s1.getGpa()) return 1;
        else if (s1.getGpa() > s2.getGpa()) return -1;
        else return 0;
    }
}
