package gkdev.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Konstantin Romanov
 * @created 16/04/2020 - 14:02
 * @project spring5-recipe-app
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {

    private Long id;
    private String description;
}
