package gkdev.springframework.spring5recipeapp.controllers;

import gkdev.springframework.spring5recipeapp.domain.Category;
import gkdev.springframework.spring5recipeapp.domain.UnitOfMeasure;
import gkdev.springframework.spring5recipeapp.repositories.CategoryRepository;
import gkdev.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author Konstantin Romanov
 * @created 02/04/2020 - 19:13
 * @project spring5-recipe-app
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is : " + optionalCategory.get().getId());
        System.out.println("UOM Id is : " + optionalUnitOfMeasure.get().getId());

        return "index";
    }
}
