package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Ingredient {

    private final String name;
    private final Integer count;
    private final String typeOfCount;
    private static int id;

}
