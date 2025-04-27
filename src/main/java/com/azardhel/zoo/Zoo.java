package com.azardhel.zoo;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animal;

    public Zoo()
    {
        animal = new ArrayList<>();
    }

    void addAnimal(Animal a)
    {
        animal.add(a);
    }

    void showAllAnimals()
    {
        for (Animal a : animal ) {
            a.introduce();
        }

    }

    void makeAllSound()
    {
        for (Animal a : animal) {
            a.makeSound();
        }
    }

    void makeAllSwim()
    {
        for (Animal a : animal) {
            if (a instanceof Swimmable) {
                ((Swimmable)a).swim();
            }
        }
    }
}
