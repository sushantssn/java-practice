package org.example.practice.streams.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;
}
