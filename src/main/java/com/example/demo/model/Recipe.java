package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor

public class Recipe {

    private final String name;
    private final Integer timeTo;
    private final Map<Integer, Ingredient> ingredientMap;
    private final List<String> steps;
    public static int recipeId;

}
