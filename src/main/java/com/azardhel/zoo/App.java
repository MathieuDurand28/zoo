package com.azardhel.zoo;

public class App 
{
    public static void main( String[] args )
    {
        Zoo zoo = new Zoo();

        Lion simba = new Lion("Simba", 5);
        Fish nemo = new Fish("Nemo", 2);
        Monkey george = new Monkey("George", 3);

        zoo.addAnimal(simba);
        zoo.addAnimal(nemo);
        zoo.addAnimal(george);

        zoo.showAllAnimals();
        zoo.showSwimmers();

    }
}
