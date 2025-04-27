package com.azardhel.zoo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenue au Zoo ! \n" );

        Lion leo = new Lion("Léo", 25);
        Monkey marco = new Monkey("Marco", 30);
        Fish cindy = new Fish("Cindy", 50);

        Zoo beauval = new Zoo();

        beauval.addAnimal(leo);
        beauval.addAnimal(marco);
        beauval.addAnimal(cindy);

        beauval.showAllAnimals();
        beauval.makeAllSound();
        beauval.makeAllSwim();

    }
}
