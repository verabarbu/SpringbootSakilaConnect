package com.tsi.v.sakila.connect.SpringbootSakilaProject.film;


import com.tsi.v.sakila.connect.SpringbootSakilaProject.category.CategoryRepository;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.filmCategory.FilmCategory;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.filmCategory.FilmCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")

public class FilmController {


    private FilmRepository filmRepository;
    private FilmCategoryRepository filmCategoryRepository;
    private CategoryRepository categoryRepository;

    public FilmController(FilmRepository filmRepository, FilmCategoryRepository filmCategoryRepository, CategoryRepository categoryRepository){
        this.filmRepository = filmRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.categoryRepository = categoryRepository;
    }

    //@ResponseBody
    //Insert new film based on attributes: title, description, release_year, language_id, original_language_id, rental_duration, rental_rate,length, replacement_cost, rating, special features
    @PostMapping("/Add_New_Film")
    public @ResponseBody
    void addNewFilm(@RequestBody FilmNews filmNews){
        Film film = filmRepository.save(new Film(filmNews));

        //add film category
        FilmCategory filmCategory = new FilmCategory(film.getFilm_id(), filmNews.getCategory_id());
        filmCategoryRepository.save(filmCategory);
    }

    //Get request / read function
    //Returns all films
    @GetMapping("/All_Films")
    public @ResponseBody
    Iterable<Film>getAllFilms(){
        return filmRepository.findAll();
    }

    //Returns film based on title input
    @GetMapping("/Get_Film_By_Title")
    public @ResponseBody
    Iterable<Film>getFilmByTitle(@RequestParam String title) {
        return filmRepository.findByTitle(title);
    }

    //Returns film based on film_id input
    @GetMapping("/Get_Film_By_Id")
    public  @ResponseBody
    Optional<Film> getFilmById(@RequestParam int film_id){
        return filmRepository.findById(film_id);
    }

    //Returns films based on actor firstName and lastName input
    @GetMapping("/Get_Films_By_Actor")
    public @ResponseBody
    List<Film> getFilmsByActor(@RequestParam String firstName, @RequestParam String lastName){
        return filmRepository.findByFilmActorFirstNameAndFilmActorLastName(firstName, lastName);
    }

    //Returns films based on category name input
    @GetMapping("/Get_Films_By_Category")
    public @ResponseBody
    List<Film> getFilmsByCategory(@RequestParam String name){
        return filmRepository.findByFilmCategoryName(name);
    }

    /*@GetMapping("/Get_Films_By_Language")
    public @ResponseBody
    List<Film> getFilmsByLanguage(@RequestParam String name){return filmRepository.findByFilmLanguageName(name);}*/

    //Updates films attributes
    @PatchMapping("/Film/{film_id}")
    public @ResponseBody Film updateFilmById(@PathVariable int film_id, @RequestBody FilmNews filmNews){
        Film film = filmRepository.findById(film_id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Film id does not exist"));
        film.updateFromFilmNews(filmNews);
        return filmRepository.save(film);
    }

    //Deletes film based on film_id
    @DeleteMapping("/Delete_Film_By_Id")
    public @ResponseBody
    void deleteFilmById(@RequestParam int film_id){
        filmRepository.deleteById(film_id);
    }
}
