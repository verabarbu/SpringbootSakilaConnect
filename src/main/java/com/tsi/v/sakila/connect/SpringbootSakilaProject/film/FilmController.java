package com.tsi.v.sakila.connect.SpringbootSakilaProject.film;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")

public class FilmController {


    private FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    //@ResponseBody
    //Insert new film based on attributes: title, description, release_year, language_id, original_language_id, rental_duration, rental_rate,length, replacement_cost, rating, special features
    @PostMapping("/Add_New_Film")
    public @ResponseBody String addNewFilm(@RequestParam String title, @RequestParam String description, @RequestParam Integer release_year, @RequestParam Integer language_id,
                                           @RequestParam Integer original_language_id, @RequestParam Integer rental_duration, @RequestParam BigDecimal rental_rate,
                                           @RequestParam Integer length, @RequestParam BigDecimal replacement_cost, @RequestParam String rating, @RequestParam String special_features){
        Film f = new Film(title, description, release_year, language_id, original_language_id, rental_duration, rental_rate, length, replacement_cost, rating, special_features);
        System.out.println(title + " " + description + " " + release_year + " " + language_id +" " + original_language_id + " " + rental_duration + " " + rental_rate + " " +
                length + " " + replacement_cost + " " + rating + " " + special_features);
        filmRepository.save(f);
        return "saved";
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
    List<Film> getFilmsByActor(@RequestParam String firstName,@RequestParam String lastName){
        return filmRepository.findByFilmActorFirstNameAndFilmActorLastName(firstName, lastName);
    }

    //Returns films based on category name input
    @GetMapping("/Get_Films_By_Category")
    public @ResponseBody
    List<Film> getFilmsByCategory(@RequestParam String name){
        return filmRepository.findByFilmCategoryName(name);
    }

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
