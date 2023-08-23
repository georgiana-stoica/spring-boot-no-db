package com.example.springbootnodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    private String name;
    private Long stock;
    private Double price;
    private boolean isDeleted = false;
}
