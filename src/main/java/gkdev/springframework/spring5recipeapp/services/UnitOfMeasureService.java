package gkdev.springframework.spring5recipeapp.services;

import gkdev.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author Konstantin Romanov
 * @created 29/04/2020 - 12:46
 * @project spring5-recipe-app
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
