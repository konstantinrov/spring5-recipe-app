package gkdev.springframework.spring5recipeapp.repositories;

import gkdev.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * @author Konstantin Romanov
 * @created 08/04/2020 - 11:32
 * @project spring5-recipe-app
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescriptionTeaspoon() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository
                .findByDescription("Teaspoon");

        assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository
                .findByDescription("Cup");

        assertEquals("Cup", unitOfMeasure.get().getDescription());
    }
}