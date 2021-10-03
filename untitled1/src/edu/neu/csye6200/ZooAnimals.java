package edu.neu.csye6200;

import java.util.ArrayList;

public class ZooAnimals {
    public ArrayList<AnimalAPI> animalArray = new ArrayList<>();

    public void add(AnimalAPI animal) {
        this.animalArray.add(animal);
    }

    public void show() {
        System.out.println("Below are the animals in the zoo: ");
        for (AnimalAPI animal : animalArray) {
            System.out.println(animal);
        }
    }

    public void makeSound() {
        for (AnimalAPI animal : animalArray) {
            animal.makeSound();
        }
    }

    public static void demo() {
        ZooAnimals model = new ZooAnimals();
        model.add(new DogC());
        model.add(new LionC());
        model.add(new CatC());
        model.show();
        model.makeSound();
    }
}
