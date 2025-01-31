package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonWithoutDog() {
        Person person = new Person("Alice", 25);
        assertFalse(person.hasOldDog());
    }

    @Test
    public void testPersonWithOldDog() {
        Dog oldDog = new Dog("Rocky", 12);
        Person person = new Person("Bob", 40, oldDog);
        assertTrue(person.hasOldDog());
    }

    @Test
    public void testChangeDogsNameSuccess() {
        Dog dog = new Dog("Charlie", 5);
        Person person = new Person("Dave", 35, dog);
        person.changeDogsName("Max");
        assertEquals("Max", dog.getName());
    }

    @Test
    public void testChangeDogsNameWithoutDog() {
        Person person = new Person("Eve", 28);
        Exception exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Max"));
        assertEquals("Eve does not own a dog!", exception.getMessage());
    }
}
