package com.tsi.v.sakila.connect.SpringbootSakilaProject.category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class CategoryController {
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    //@ResponseBody
    //Get request / read function
    //Returns all categories
    @GetMapping("/All_Categories")
    public @ResponseBody
    Iterable<Category> getAllCategories(){
        return categoryRepository.findAll();
    }


}
