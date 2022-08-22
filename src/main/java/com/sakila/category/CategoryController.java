package com.sakila.category;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class CategoryController {
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    //@ResponseBody
    //Post request
    @PostMapping("/Add_New_Category")
    public @ResponseBody
    void addNewCategory(@RequestParam String name) {
        Category category = new Category(name);
        categoryRepository.save(category);
    }
    //Get request / read function
    //Returns all categories
    @GetMapping("/All_Categories")
    public @ResponseBody
    Iterable<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/Get_Category_By_Id")
    public @ResponseBody
    Optional<Category> getCategoryById(@RequestParam int categoryId){
        return categoryRepository.findById(categoryId);
    }
    @GetMapping("/Get_Category_By_Name")
    public @ResponseBody
    Optional<Category> getCategoryByName(@RequestParam String name){
        return categoryRepository.findCategoryByName(name);
    }
    //Delete request
    @DeleteMapping("/Delete_Category_By_Id")
    public @ResponseBody
    void deleteCategoryById(@RequestParam int categoryId){
        categoryRepository.deleteById(categoryId);
    }


}
