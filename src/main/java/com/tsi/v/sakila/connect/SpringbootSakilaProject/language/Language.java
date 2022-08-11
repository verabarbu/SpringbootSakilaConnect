package com.tsi.v.sakila.connect.SpringbootSakilaProject.language;

import javax.persistence.*;

@Entity
@Table(name = "language")

public class Language {

    @Id
    @Column(name = "language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int languageId;

    /*@ManyToMany(mappedBy = "filmLanguage")
    Set<Film> languageFilm;*/


    //Attribute
    private String name;

    //Constructor
    public Language(String name){this.name = name;}

    //Empty Constructor
    public Language(){}

    //Methods
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
