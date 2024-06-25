package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class Main {


        public static void main(String[] args) {
            ArrayList<Person> personArrayList = new ArrayList<>();

            Person person = new Person<>(1,  345,  "vitya",  3);
            Person person1 = new Person<>(2,  34555,  "vityaаа",  2);
            Person person2 = new Person<>(3,  345,  "vityaоо",  1);
            EmployeeDirectory employeeDirectory = new EmployeeDirectory();
            employeeDirectory.addPerson(person);
            employeeDirectory.addPerson(person1);
            employeeDirectory.addPerson(person2);
            System.out.println("-------");
            System.out.println(employeeDirectory.searchPersonExperience(2));
            System.out.println("-------");
            System.out.println(employeeDirectory.phoneToName("vityaаа"));
            System.out.println("-------");
            System.out.println(employeeDirectory.searchPersonNumber(3));
            System.out.println("-------");
            System.out.println(employeeDirectory.getEmployeeDirectory());
        }

    }
