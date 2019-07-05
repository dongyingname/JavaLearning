/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.text.NumberFormat;

/**
 *
 * @author yingd
 */
public class Employee {
    public String toString(){
        return "Employee ID:" + getEmpld() +"\n" +
                "Employee Name:" + getName() + "\n" +
                "Employee SSN:" + getSsn() + "\n" +
                "Employee Salary" + NumberFormat.getCurrencyInstance().format(
                getSalary());
    }
}
