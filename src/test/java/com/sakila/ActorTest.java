package com.sakila;

import com.sakila.actor.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    Actor testActor = new Actor();


    @Test
    void test_setActorId() {
        testActor.setActorId(205);
        assertEquals(205, testActor.getActorId(), "Can't get id");
    }
    @Test
    void test_setFirstName(){
        testActor.setFirstName("Andreea");
        assertEquals("Andreea", testActor.getFirstName(), "Can't get firstName");
    }
    @Test
    void test_setLastName(){
        testActor.setLastName("Marin");
        assertEquals("Marin", testActor.getLastName(), "Can't get lastName");
    }

}
