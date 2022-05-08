package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;
    private String address;
    private int mobileNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Student(String name, String address, int mobileNumber) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}


public class SteamPractice1 {

    public static void main(String[] args) {

        Student s1 = new Student("Sushant","Kandivali",9821);
        Student s2 = new Student("Rishabh","Dadar",3333);
        Student s3 = new Student("Saurabh","Kandivali",1234);
        Student s4 = new Student("Sachin","Bandra",1233);
        Student s5 = new Student("Virat","Delhi",1235);
        Student s6 = new Student("Dhoni","Jharkhand",7777);
        Student s7 = new Student("Rohit","Borivali",3333);
        Student s8 = new Student("Samual","Gujrat",9821);


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);

        System.out.println("List of students "+studentList);

        //Get student with exact match name "samual"

        List<Student> studentListByName = studentList.stream().filter(student -> student.getName().equals("Samual")).collect(Collectors.toList());

        System.out.println("List of Student whit name as Samual "+studentListByName);

        //Get student with matching address "Dadar"

        List<Student> studentListByAddress = studentList.stream().filter(student -> student.getAddress().equals("Dadar")).collect(Collectors.toList());

        System.out.println("List of student with Address as Dadar "+studentListByAddress);

        //Get all student having mobile numbers 3333.

        List<Student> studentByMobileNumber = studentList.stream().filter(student -> student.getMobileNumber() == 3333).collect(Collectors.toList());

        System.out.println("List of Students with Mobile Number as 3333 "+studentByMobileNumber);

        //Get all student having mobile number 1233 and 1234

        List<Student> studentByMobileNumber1 = studentList.stream().filter(student -> (student.getMobileNumber() == 1233 ||student.getMobileNumber() == 1234) ).collect(Collectors.toList());

        System.out.println("List of Students with Mobile Number as 1233 and 1234 "+studentByMobileNumber1);


        //Convert List to List of student name

        List<String> studentNameList = studentList.stream().map(student -> student.getName()).collect(Collectors.toList());

        System.out.println("List of Students Names " +studentNameList);

    }


}
