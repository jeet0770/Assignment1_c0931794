package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void testDogCreation() {
        Dog dog = new Dog("Buddy", 5);
        assertEquals("Buddy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testSetters() {
        Dog dog = new Dog("Buddy", 5);
        dog.setName("Max");
        dog.setAge(10);
        assertEquals("Max", dog.getName());
        assertEquals(10, dog.getAge());
    }
}
