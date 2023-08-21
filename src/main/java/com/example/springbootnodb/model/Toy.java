package com.example.springbootnodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toy {
    private String name;
    private String color;
    private String type;
    private String description;
    private String imageURL;
}
