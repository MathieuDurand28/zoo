package com.azardhel.zoo;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Le lion " + getName() + " rugit !");
    }
}