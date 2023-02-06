package com.example.demo.services.impl;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Recipe;
import com.example.demo.services.BookService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class BookServiceImpl implements BookService {

    public static Map<Integer, Recipe> recipes = new HashMap<>();
    public static Map<Integer, Ingredient> ingredients = new HashMap<>();

    public static int recipeId;
    private static int id;
    @Override
    public void addRecipe(Recipe recipe) {
        recipes.put(recipeId++, recipe);
    }

    @Override
    public Recipe getRecipe(int recipeId) {
        return recipes.get(recipeId);
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.put(id++, ingredient);

    }

    @Override
    public Ingredient getIngredient (int id) {
        return ingredients.get(id);
    }
}
