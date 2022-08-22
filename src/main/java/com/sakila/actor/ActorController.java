package com.sakila.actor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")

public class ActorController {
    private ActorRepository actorRepository;
    public ActorController (ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }
    //@ResponseBody
    //Insert new film based on attributes: firstName, lastName
    @PostMapping("/Add_New_Actor")
    public @ResponseBody
    void addNewActor(@RequestBody ActorNews actorNews){
        Actor actor = actorRepository.save(new Actor(actorNews));
    }

    //Get request / read function
    //Returns all actors
    @GetMapping("/All_Actors")
    public @ResponseBody
    Iterable<Actor>getAllActors(){
        return actorRepository.findAll();
    }

    //Returns actors based on actor_id input
    @GetMapping("/Get_Actor_By_Id")
    public @ResponseBody
    Optional<Actor> getActorById(@RequestParam int actor_id) {
        return actorRepository.findById(actor_id);
    }

    //Returns actors based on firstName input
    @GetMapping("/Get_Actor_By_First_Name")
    public @ResponseBody
    Iterable<Actor> getActorByFirstName(@RequestParam String firstName){
        return actorRepository.findByFirstName(firstName);
    }

    //Updates actors attributes
    @PatchMapping("/Actor/{actor_id}")
    public @ResponseBody Actor updateActorById(@PathVariable int actor_id, @RequestBody ActorNews actorNews){
        Actor actor = actorRepository.findById(actor_id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Actor id does not exist"));
        actor.updateFromActorNews(actorNews);
        return actorRepository.save(actor);
    }

    //Deletes actor based on actor_id
    @DeleteMapping("/Delete_Actor_By_Id")
    public @ResponseBody
    void deleteActorById(@RequestParam int actor_id){
        actorRepository.deleteById(actor_id);
    }


}
