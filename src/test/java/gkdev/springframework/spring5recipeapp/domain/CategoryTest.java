package gkdev.springframework.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Konstantin Romanov
 * @created 07/04/2020 - 16:45
 * @project spring5-recipe-app
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long idVal = 4L;
        category.setId(idVal);
        assertEquals(idVal, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}