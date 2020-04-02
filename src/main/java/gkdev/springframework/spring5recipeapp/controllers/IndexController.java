package gkdev.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Konstantin Romanov
 * @created 02/04/2020 - 19:13
 * @project spring5-recipe-app
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        return "index";
    }
}
