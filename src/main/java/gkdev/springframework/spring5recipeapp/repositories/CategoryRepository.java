package gkdev.springframework.spring5recipeapp.repositories;

import gkdev.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Konstantin Romanov
 * @created 06/04/2020 - 13:54
 * @project spring5-recipe-app
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
