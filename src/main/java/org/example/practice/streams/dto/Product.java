package org.example.practice.streams.dto;

import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;

    private String name;
    private String category;
    @With private Double price;


    @ToString.Exclude
    private Set<Order> orders;
}