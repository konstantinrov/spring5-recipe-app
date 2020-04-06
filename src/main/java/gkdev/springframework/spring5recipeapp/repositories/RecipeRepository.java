package gkdev.springframework.spring5recipeapp.repositories;

import gkdev.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 13:53
 * @project spring5-recipe-app
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
