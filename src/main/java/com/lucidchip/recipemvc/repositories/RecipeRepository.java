package com.lucidchip.recipemvc.repositories;

import com.lucidchip.recipemvc.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long > {
}
