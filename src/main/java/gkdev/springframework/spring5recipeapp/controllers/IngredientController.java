package gkdev.springframework.spring5recipeapp.controllers;

import gkdev.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Konstantin Romanov
 * @created 28/04/2020 - 17:26
 * @project spring5-recipe-app
 */
@Slf4j
@Service
public class IngredientController {

    private final RecipeService recipeService;

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    @RequestMapping("/recipe/{id}/ingredients")
    public String listIngredients(@PathVariable String id, Model model) {
        log.debug("Getting ingredient list for id : " + id);

        model.addAttribute("recipe", recipeService
                .findCommandById(Long.valueOf(id)));

        return "recipe/ingredient/list";
    }
}
