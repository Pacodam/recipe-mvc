package com.lucidchip.recipemvc.services;

import com.lucidchip.recipemvc.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
