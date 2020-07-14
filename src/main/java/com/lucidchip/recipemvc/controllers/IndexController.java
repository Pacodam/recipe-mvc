package com.lucidchip.recipemvc.controllers;

import com.lucidchip.recipemvc.domain.Category;
import com.lucidchip.recipemvc.domain.UnitOfMeasure;
import com.lucidchip.recipemvc.repositories.CategoryRepository;
import com.lucidchip.recipemvc.repositories.RecipeRepository;
import com.lucidchip.recipemvc.repositories.UnitOfMeasureRepository;
import com.lucidchip.recipemvc.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
