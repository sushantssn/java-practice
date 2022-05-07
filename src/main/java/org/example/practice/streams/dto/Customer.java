package org.example.practice.streams.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private Integer tier;
}
