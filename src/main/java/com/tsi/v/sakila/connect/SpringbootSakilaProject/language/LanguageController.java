package com.tsi.v.sakila.connect.SpringbootSakilaProject.language;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")

public class LanguageController {

    private LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;}

        //@ResponseBody
        //Get request / read function
        //Returns all languages
        @GetMapping("/All_Languages")
        public @ResponseBody
        Iterable<Language> getAllLanguages(){
            return languageRepository.findAll();
        }

}
