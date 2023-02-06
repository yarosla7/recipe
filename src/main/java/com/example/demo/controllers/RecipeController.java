package com.example.demo.controllers;

import com.example.demo.model.Recipe;
import com.example.demo.services.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private BookService bookService;

    public RecipeController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getRecipe")
    public Recipe getRecipe(int id) {
        return bookService.getRecipe(id);
    }

    @PutMapping("/putRecipe")
    public void addRecipe(Recipe recipe) {
        bookService.addRecipe(recipe);
    }
}
