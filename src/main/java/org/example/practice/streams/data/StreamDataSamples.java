package org.example.practice.streams.data;

import org.example.practice.streams.dto.Address;
import org.example.practice.streams.dto.MobileNumber;
import org.example.practice.streams.dto.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDataSamples {


    public static void main(String[] args) {

        Student student1 = new Student(
                "Samual",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));


        Student student4 = new Student(
                "Tim",
                29,
                new Address("1248"),
                Arrays.asList(new MobileNumber("3353"), new MobileNumber("4447"),new MobileNumber("9823")));
        Student student5 = new Student(
                "Huan",
                27,
                new Address("1250"),
                Arrays.asList(new MobileNumber("3258"), new MobileNumber("4259"),new MobileNumber("9820")));

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println("size ="+studentList.size());
    }
}
