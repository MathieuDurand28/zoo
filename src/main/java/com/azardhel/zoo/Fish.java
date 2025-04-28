package com.azardhel.zoo;

public class Fish extends Animal implements Swimmable {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Le poisson " + getName() + " fait des bulles...");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " nage joyeusement !");
    }
}