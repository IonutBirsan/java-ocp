package org.example.ch45.ex5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal mammal = new Mammal();
        Animal bird = new Bird();
        Animal eagle = new Eagle();

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(animal1);
        animals.add(mammal);
        animals.add(bird);
        animals.add(eagle);

        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println(animal.getClass());
        }
    }
}
