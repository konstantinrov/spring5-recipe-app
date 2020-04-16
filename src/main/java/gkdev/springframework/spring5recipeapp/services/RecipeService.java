package gkdev.springframework.spring5recipeapp.services;

import gkdev.springframework.spring5recipeapp.commands.RecipeCommand;
import gkdev.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 15:07
 * @project spring5-recipe-app
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
