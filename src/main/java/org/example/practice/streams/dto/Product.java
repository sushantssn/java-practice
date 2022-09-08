package org.example.practice.streams.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;

    private String name;
    private String category;
   private Double price;


    @ToString.Exclude
    private Set<Order> orders;
}