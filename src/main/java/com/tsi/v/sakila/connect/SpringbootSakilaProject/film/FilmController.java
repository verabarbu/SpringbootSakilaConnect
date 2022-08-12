package com.tsi.v.sakila.connect.SpringbootSakilaProject.film;


import com.tsi.v.sakila.connect.SpringbootSakilaProject.category.CategoryRepository;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.filmCategory.FilmCategoryRepository;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.filmactor.FilmActor;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.filmactor.FilmActorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")

public class FilmController {


    private FilmRepository filmRepository;
    private FilmCategoryRepository filmCategoryRepository;
    private CategoryRepository categoryRepository;
    private FilmActorRepository filmActorRepository;

    public FilmController(FilmRepository filmRepository, FilmCategoryRepository filmCategoryRepository, CategoryRepository categoryRepository, FilmActorRepository filmActorRepository){
        this.filmRepository = filmRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.categoryRepository = categoryRepository;
        this.filmActorRepository = filmActorRepository;
    }

    //@ResponseBody
    //Insert new film based on attributes: title, description, release_year, language_id, original_language_id, rental_duration, rental_rate,length, replacement_cost, rating, special features
    @PostMapping("/Add_New_Film")
    public @ResponseBody
    void addNewFilm(@RequestBody FilmNews filmNews){
        Film film = filmRepository.save(new Film(filmNews));

        //create film actors connections
        Integer filmId = film.getFilm_id();
        createFilmActors(filmId, filmNews.getActorIds());

    }
    private void createFilmActors(Integer filmId, Set<Integer> actorIds){
        if(actorIds == null) return;

        List<FilmActor> filmActors = actorIds
                .stream()
                .map(actorId -> new FilmActor(filmId, actorId))
                .toList();

        filmActorRepository.saveAll(filmActors);
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

        Integer filmId = film.getFilm_id();
        updateFilmActors(filmId, filmNews.getActorIds());

        return filmRepository.save(film);
    }

    private void updateFilmActors(Integer filmId, Set<Integer> actorIds){
        if(actorIds == null) return;

        Set<FilmActor> existingActorLinks = filmActorRepository.findByFilmActorKeyFilmId(filmId);

        deleteUnwantedFilmActors(actorIds, existingActorLinks);
        createNewFilmActors(filmId, actorIds, existingActorLinks);
    }

    private void deleteUnwantedFilmActors(Set<Integer> actorIds, Set<FilmActor> existingActorLinks){
        existingActorLinks.stream()
                .filter(filmActor -> !actorIds.contains(filmActor.getFilmActorKey().getActorId()))
                .forEach(filmActorRepository::delete);
    }
    private void createNewFilmActors(Integer filmId, Set<Integer> actorIds, Set<FilmActor> existingActorLinks){
        List<Integer> linkedActors = existingActorLinks.stream()
                .map(filmActor -> filmActor.getFilmActorKey().getActorId())
                .toList();

        actorIds.stream()
                .filter(actorId -> !linkedActors.contains(actorId))
                .map(actorId -> new FilmActor(filmId, actorId))
                .forEach(filmActorRepository::save);
    }

    //Deletes film based on film_id
    @DeleteMapping("/Delete_Film_By_Id")
    public @ResponseBody
    void deleteFilmById(@RequestParam int film_id){
        filmRepository.deleteById(film_id);
    }
}
