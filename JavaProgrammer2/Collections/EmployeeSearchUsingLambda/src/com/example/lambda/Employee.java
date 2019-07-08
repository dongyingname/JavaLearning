/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lambda;

/**
 *
 * @author yingd
 */
public class Employee {

    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;

    public static class Builder {

        private String givenName = "";
        private String surName = "";
        private int age = 0;
        private Gender gender = Gender.FEMALE;
        private Role role = Role.STAFF;
        private String dept = "";
        private String eMail = "";
        private String phone = "";
        private String address = "";
        private String city = "";
        private String state = "";
        private String code = "";
        
        public Employee.Builder givenName(String givenName){
            this.givenName = givenName;
            return this;
        }
         public Employee.Builder surName(String surName){
            this.surName = surName;
            return this;
        }
         
          public Employee.Builder age(int val){
            age = val;
            return this;
        }
          
            public Employee.Builder gender(Gender val){
            this.gender = val;
            return this;
        }
        
    }
}
