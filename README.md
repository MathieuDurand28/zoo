# Zoo Management Program

Ce programme permet de gérer plusieurs animaux dans un zoo. Chaque animal possède des fonctionnalités spécifiques qui reflètent ses caractéristiques.

## Fonctionnalités

### Tous les animaux peuvent :

- **Se présenter** : Chaque animal peut se présenter en utilisant la méthode `introduce()`.
- **Produire un son** : Chaque animal peut produire un son spécifique grâce à la méthode `makeSound()`.

### Certains animaux peuvent également :

- **Nager** : Les animaux aquatiques disposent de la méthode `swim()` pour nager.

## Objectifs

Ce programme vise à modéliser un zoo en mettant en avant les comportements spécifiques des différents types d'animaux.

## Structure du projet

- **Classes principales** : Chaque type d'animal sera représenté par une classe spécifique.
- **Méthodes** :
  - `introduce()`
  - `makeSound()`
  - `swim()` (uniquement pour les animaux aquatiques)

## Exemples d'utilisation

```java
Animal lion = new Lion();
lion.introduce(); // "Je suis un lion."
lion.makeSound(); // "Roar!"

Animal poisson = new Poisson();
poisson.introduce(); // "Je suis un poisson."
poisson.makeSound(); // "Blop!"
poisson.swim(); // "Je nage dans l'eau."
```

## Prérequis

- Java 8 ou version ultérieure.

## Installation

1. Clonez le dépôt.
2. Compilez les fichiers Java.
3. Exécutez le programme principal.
