package com.lucidchip.recipemvc.controllers;

import com.lucidchip.recipemvc.domain.Category;
import com.lucidchip.recipemvc.domain.UnitOfMeasure;
import com.lucidchip.recipemvc.repositories.CategoryRepository;
import com.lucidchip.recipemvc.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription(("Teaspoon"));

        System.out.println("category is " + categoryOptional.get().getId());
        System.out.println("UOM is " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
