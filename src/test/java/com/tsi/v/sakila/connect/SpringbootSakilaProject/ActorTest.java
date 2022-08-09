package com.tsi.v.sakila.connect.SpringbootSakilaProject;

import com.tsi.v.sakila.connect.SpringbootSakilaProject.actor.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ActorTest {

    @Test
    void test_getActor_id(){
        Actor testActor = new Actor("Andreea", "Marin");
        testActor.setActor_id(205);
        assertEquals(205, testActor.getActor_id(), "Can't get id");
    }

    @Test
    void test_getFirstName(){
        Actor testActor = new Actor("Andreea", "Marin");
        assertEquals("Andreea", testActor.getFirstName(), "Can't get firstName");
    }

    @Test
    void test_setFirstName(){
        Actor testActor = new Actor("Andreea", "Marin");
        testActor.setFirstName("Ana");
        assertEquals("Ana", testActor.getFirstName(), "Can't set firstName");
    }

    @Test
    void test_getLastName(){
        Actor testActor = new Actor("Andreea", "Marin");
        assertEquals("Marin", testActor.getLastName(), "Can't get lastName");
    }

    @Test
    void test_setLastName(){
        Actor testActor = new Actor("Andreea", "Marin");
        testActor.setLastName("Martin");
        assertEquals("Martin", testActor.getLastName(), "Can't set lastName");
    }


}

