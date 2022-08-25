package com.sakila.film;


import com.sakila.filmactor.FilmActor;
import com.sakila.filmactor.FilmActorRepository;
import com.sakila.filmcategory.FilmCategory;
import com.sakila.filmcategory.FilmCategoryRepository;
import com.sakila.response.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private FilmActorRepository filmActorRepository;


    public FilmController(FilmRepository filmRepository, FilmCategoryRepository filmCategoryRepository, FilmActorRepository filmActorRepository){
        this.filmRepository = filmRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.filmActorRepository = filmActorRepository;

    }

    //@ResponseBody
    //Insert new film based on filmNews data transfer object, actor and categories links
    @PostMapping("/Add_New_Film")
    public @ResponseBody
    void addNewFilm(@RequestBody FilmNews filmNews){
        Film film = filmRepository.save(new Film(filmNews));
        Integer filmId = film.getFilmId();

        //create film actors connections
        createFilmActors(filmId, filmNews.getActorIds());

        //create film categories connections
        createFilmCategories(filmId, filmNews.getCategoryIds());



    }
    //create film - actor relationship table
    private void createFilmActors(Integer filmId, Set<Integer> actorIds){
        if(actorIds == null) return;
        //create filmActor entities
        List<FilmActor> filmActors = actorIds
                .stream()
                .map(actorId -> new FilmActor(filmId, actorId))
                .toList();
        //save filmActor entities
        filmActorRepository.saveAll(filmActors);
    }
    //create film - category relationship table
    private void createFilmCategories(Integer filmId, Set<Integer> categoryIds){
        if(categoryIds == null) return;
        //create filmCategory entities
        List<FilmCategory> filmCategories = categoryIds
                .stream()
                .map(categoryId -> new FilmCategory(filmId, categoryId))
                .toList();
        //save filmCategory entities
        filmCategoryRepository.saveAll(filmCategories);
    }

    //Get request / read function
    //Returns all films
    @GetMapping("/All_Films")
    public @ResponseBody
    ResponseEntity<Object> getAllFilms(){
        try {
            Iterable<Film> result = filmRepository.findAll();
            return ResponseHandler.generateResponse("Successfully retrieved all films!", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    //Returns film based on title input
    @GetMapping("/Get_Film_By_Title")
    public @ResponseBody
    ResponseEntity<Object> getFilmByTitle(@RequestParam String title){
        try{
            Iterable<Film> result = filmRepository.findByTitle(title);
            return ResponseHandler.generateResponse("Successfully retrieved film by title!", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    //Returns film based on filmId input
    @GetMapping("/Get_Film_By_Id")
    public  @ResponseBody
    ResponseEntity<Object> getFilmById(@RequestParam int filmId){
        try{
            Optional<Film> result = filmRepository.findById(filmId);
            return ResponseHandler.generateResponse("Successfully retrieved film by id!", HttpStatus.OK, result);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

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

    //Updates films attributes
    @PatchMapping("/Film/{filmId}")
    public @ResponseBody Film updateFilmById(@PathVariable int filmId, @RequestBody FilmNews filmNews){
        Film film = filmRepository.findById(filmId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Film id does not exist"));
        film.updateFromFilmNews(filmNews);
        //update film - actor and category relationships
        filmId = film.getFilmId();
        updateFilmActors(filmId, filmNews.getActorIds());
        updateFilmCategories(filmId, filmNews.getCategoryIds());
        return filmRepository.save(film);
    }
    //update film - actor relationship
    private void updateFilmActors(Integer filmId, Set<Integer> actorIds){
        if(actorIds == null) return;

        Set<FilmActor> existingActorLinks = filmActorRepository.findByFilmActorKeyFilmId(filmId);

        deleteUnwantedFilmActors(actorIds, existingActorLinks);
        createNewFilmActors(filmId, actorIds, existingActorLinks);
    }
    //delete film - actor relationship
    private void deleteUnwantedFilmActors(Set<Integer> actorIds, Set<FilmActor> existingActorLinks){
        existingActorLinks.stream()
                .filter(filmActor -> !actorIds.contains(filmActor.getFilmActorKey().getActorId()))
                .forEach(filmActorRepository::delete);
    }
    //create new film - actor relationship
    private void createNewFilmActors(Integer filmId, Set<Integer> actorIds, Set<FilmActor> existingActorLinks){
        List<Integer> linkedActors = existingActorLinks.stream()
                .map(filmActor -> filmActor.getFilmActorKey().getActorId())
                .toList();

        actorIds.stream()
                .filter(actorId -> !linkedActors.contains(actorId))
                .map(actorId -> new FilmActor(filmId, actorId))
                .forEach(filmActorRepository::save);
    }
    //update film - category relationship
    private void updateFilmCategories(Integer filmId, Set<Integer> categoryIds){
        if (categoryIds == null) return;

        Set<FilmCategory> existingCategoryLinks = filmCategoryRepository.findByFilmCategoryKeyFilmId(filmId);

        deleteUnwantedFilmCategories(categoryIds, existingCategoryLinks);
        createNewFilmCategories(filmId, categoryIds, existingCategoryLinks);
    }
    //delete film - category relationship
    private void deleteUnwantedFilmCategories(Set<Integer> categoryIds, Set<FilmCategory> existingCategoryLinks){
        existingCategoryLinks.stream()
                .filter(filmCategory -> !categoryIds.contains(filmCategory.getFilmCategoryKey().getCategoryId()))
                .forEach(filmCategoryRepository::delete);
    }
    //create new film - actor relationship
    private void createNewFilmCategories(Integer filmId, Set<Integer> categoryIds, Set<FilmCategory> existingCategoryLinks){
        List<Integer> linkedCategories = existingCategoryLinks.stream()
                .map(filmCategory -> filmCategory.getFilmCategoryKey().getCategoryId())
                .toList();

        categoryIds.stream()
                .filter(categoryId -> !linkedCategories.contains(categoryId))
                .map(categoryId -> new FilmCategory(filmId, categoryId))
                .forEach(filmCategoryRepository::save);
    }

    //Deletes film based on filmId
    @DeleteMapping("/Delete_Film_By_Id")
    public @ResponseBody
    void deleteFilmById(@RequestParam int filmId){
        filmRepository.deleteById(filmId);
    }


}
