package gkdev.springframework.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Konstantin Romanov
 * @created 02/05/2020 - 10:20
 * @project spring5-recipe-app
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);

}
