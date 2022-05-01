package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
class Employee{
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class PredicateExample {

    public static void main(String[] args) {

        Predicate <Integer> integerPredicate = I -> I>10;
        Predicate <String> stringPredicate = s -> s.length() >10;
        Predicate < Collection> collectionPredicate = collection -> collection.isEmpty();
        Predicate <Employee> nameCheck = employee -> employee.getName().equals("Sushant");
        Predicate <Employee> salaryCheck = employee -> employee.getSalary() > 3000;

        System.out.println("For given number "+100+" the value of predicate is "+integerPredicate.test(100));
        System.out.println("For given number "+5+" the value of predicate is "+integerPredicate.test(5));
        System.out.println("For String MyComputer the value of Predicate is "+stringPredicate.test("MyComputer"));


      List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee("Rishabha",3000));
        employeeList.add(new Employee("Sushant",4000));
        employeeList.add(new Employee("Sachin",5000));
        employeeList.add(new Employee("Dhoni",6000));
        employeeList.add(new Employee("Virat",7000));
        employeeList.add(new Employee("Raina",8000));
        collectionPredicate.test(employeeList);
        for (Employee e:employeeList
             ) {
            System.out.println("For Employee "+e.getName()+" the increment condition is "+nameCheck.and(salaryCheck).test(e));
        }





    }
}
