package com.azardhel.zoo;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Le singe " + getName() + " crie : Hou Hou !");
    }
}