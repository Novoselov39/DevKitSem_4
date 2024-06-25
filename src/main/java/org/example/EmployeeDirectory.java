package org.example;


import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
   ArrayList<Person> employeeDirectory = new ArrayList<>();

    public ArrayList<Person> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void addPerson(Person person){

        employeeDirectory.add(person);

   }

    public List<Person> searchPersonExperience(Integer yaer){

        return employeeDirectory.stream().filter(c->c.experience()==yaer).toList();
    }

    public Integer phoneToName(String name){

        return (Integer) employeeDirectory.stream().filter(c->c.name()==name).toList().get(0).numberPhone();
    }

    public Person searchPersonNumber(Integer number){

        return employeeDirectory.stream().filter(c->c.personNumber()==number).toList().get(0);
    }



}
