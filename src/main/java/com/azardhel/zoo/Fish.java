package com.azardhel.zoo;

public class Fish extends Animal implements Swimmable {

    public Fish(String name, Integer age) {
            super(name, age);
        }
    
    @Override
    public void introduce()
    {
        System.out.println("- Je suis un "+name+" de "+age+" ans! \n");
    }

    @Override
    public void makeSound()
    {
        System.out.println("- Gloups ! ");
    }

    @Override
    public void swim()
    {
        System.out.println("[Activité piscine]");
        System.out.println("-> "+name+" nage dans l'eau !");
    }
}
