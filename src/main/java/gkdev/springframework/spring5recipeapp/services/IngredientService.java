package gkdev.springframework.spring5recipeapp.services;

import gkdev.springframework.spring5recipeapp.commands.IngredientCommand;

/**
 * @author Konstantin Romanov
 * @created 29/04/2020 - 11:59
 * @project spring5-recipe-app
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long IngredientId);
}
