package org.example.StringClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListOfEmployeeSorting {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setName("Sushant");
        e1.setSalary(2000);

        Employee e2 = new Employee();
        e2.setName("Sushant");
        e2.setSalary(3000);
        Employee e3 = new Employee();
        e3.setName("Sushant");
        e3.setSalary(4000);
        Employee e4 = new Employee();
        e4.setName("Rishabh");
        e4.setSalary(5000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        employeeList.stream().sorted((o1,o2) -> (int)(o2.getSalary()- o1.getSalary()) ).collect(Collectors.toList()).stream().peek(employee -> System.out.println(employee)).collect(Collectors.toList());



    }

}

class Employee
{
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }
}