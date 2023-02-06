package com.example.demo.services;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Recipe;

import java.util.Map;

public interface BookService {

    void addRecipe(Recipe recipe);

    Recipe getRecipe(int id);

    void addIngredient(Ingredient ingredient);

    Ingredient getIngredient(int id);


}
