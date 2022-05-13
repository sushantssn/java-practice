package org.example.practice.streams.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
public class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;
}
