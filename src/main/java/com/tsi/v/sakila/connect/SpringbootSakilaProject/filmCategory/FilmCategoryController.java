package com.tsi.v.sakila.connect.SpringbootSakilaProject.filmCategory;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sakila")
public class FilmCategoryController {
    private FilmCategoryRepository filmCategoryRepository;

    public FilmCategoryController(FilmCategoryRepository filmCategoryRepository){
        this.filmCategoryRepository = filmCategoryRepository;
    }

    public FilmCategoryRepository getFilmCategoryRepository() {
        return filmCategoryRepository;
    }

    public void setFilmCategoryRepository(FilmCategoryRepository filmCategoryRepository) {
        this.filmCategoryRepository = filmCategoryRepository;
    }

    @PostMapping("/Add_New_Film_Category_Link")
    public @ResponseBody
    void addNewFilmCategoryLink(@RequestParam int film_id, @RequestParam int category_id){
        FilmCategory filmCategory = new FilmCategory(film_id, category_id);
        filmCategoryRepository.save(filmCategory);
    }
}
