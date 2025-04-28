package com.azardhel.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
        } else {
            System.out.println("Erreur : animal nul non ajouté !");
        }
    }

    public void showAllAnimals() {
        System.out.println("-- Liste des animaux --");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void showSwimmers() {
        System.out.println("-- Animaux nageurs --");
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                ((Swimmable)animal).swim();
            }
        }
    }
}