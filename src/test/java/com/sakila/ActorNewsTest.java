package com.sakila;

import com.sakila.actor.Actor;
import com.sakila.actor.ActorNews;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ActorNewsTest {
    @Test
    void test_actorNewsConstructor(){
        ActorNews testActorNews = new ActorNews("Andreea", "Marin");
        assertEquals(Optional.of("Andreea"), testActorNews.getFirstName(),"Can't get firstName" );
        assertEquals(Optional.of("Marin"), testActorNews.getLastName(),"Can't get lastName" );

    }
    @Test
    void test_setActorId() {
        Actor testActor = new Actor();
        testActor.setActorId(205);
        assertEquals(205, testActor.getActorId(), "Can't get id");
    }
    @Test
    void test_getFirstName(){
        ActorNews testActorNews = new ActorNews("Andreea", "Marin");
        assertEquals(Optional.of("Andreea"), testActorNews.getFirstName(), "Can't get firstName");
    }

    @Test
    void test_setFirstName(){
        ActorNews testActorNews = new ActorNews();
        testActorNews.setFirstName("Ana");
        assertEquals(Optional.of("Ana"), testActorNews.getFirstName(), "Can't set firstName");
    }

    @Test
    void test_getLastName(){
        ActorNews testActorNews = new ActorNews("Andreea", "Marin");
        assertEquals(Optional.of("Marin"), testActorNews.getLastName(), "Can't get lastName");
    }

    @Test
    void test_setLastName(){
        ActorNews testActorNews = new ActorNews();
        testActorNews.setLastName("Martin");
        assertEquals(Optional.of("Martin"), testActorNews.getLastName(), "Can't set lastName");
    }


}

