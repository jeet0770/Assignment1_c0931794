package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            Person personWithoutDog = new Person("John", 30);
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
