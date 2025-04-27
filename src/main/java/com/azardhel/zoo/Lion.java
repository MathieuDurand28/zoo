package com.azardhel.zoo;

public class Lion extends Animal {

    public Lion(String name, Integer age) {
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
        System.out.println("- Roooar ! ");
    }
}
