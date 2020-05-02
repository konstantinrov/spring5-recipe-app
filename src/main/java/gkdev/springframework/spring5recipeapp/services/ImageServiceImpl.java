package gkdev.springframework.spring5recipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Konstantin Romanov
 * @created 02/05/2020 - 10:25
 * @project spring5-recipe-app
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    @Override
    public void saveImageFile(Long valueOf, MultipartFile file) {
        //todo later
        log.debug("Received a file");
    }
}
