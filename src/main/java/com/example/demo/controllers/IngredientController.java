package com.example.demo.controllers;

import com.example.demo.model.Ingredient;
import com.example.demo.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private BookService bookService;

    public IngredientController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getIngredients")
    public Ingredient getIngredients(int id) {
        return bookService.getIngredient(id);
    }

    @PutMapping("/putIngredient")
    public void addIngredient(Ingredient ingredient) {
        bookService.addIngredient(ingredient);
    }
}
