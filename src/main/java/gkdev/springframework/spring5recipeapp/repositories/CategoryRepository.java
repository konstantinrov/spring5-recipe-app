package gkdev.springframework.spring5recipeapp.repositories;

import gkdev.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 13:54
 * @project spring5-recipe-app
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
