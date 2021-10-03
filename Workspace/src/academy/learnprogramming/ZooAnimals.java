package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {
    private static int totalNoOfEnclosures = 4;
    private List<AnimalAPI> animalList = new ArrayList<>();


    public void add(AnimalAPI animals) {
        this.animalList.add(animals);
    }

    public void show() {
        System.out.printf("\nTotal no of enclosures in the Zoo are " + totalNoOfEnclosures + " and below are the list of animals in each enclosures respectively:\n");
        for (int i = 1; i <= totalNoOfEnclosures; i++) {
            System.out.println("Enclosure: " + i);
            for (AnimalAPI animals : animalList) {
                if (animals.getEnclosure() == i) {
                    System.out.printf(animals.getName() + "\n");
                }
            }
        }
    }
    public void move(String name, int destinationEnclosure){
        int count =0;
        if(destinationEnclosure<=totalNoOfEnclosures){
            for (AnimalAPI animal : animalList){
                if(animal.getName() == name){
                    count++;
                    animal.moving(destinationEnclosure);
                }
            }
            if (count==0){
                System.out.println(name+" no such animal in the Zoo");
            }
        }else
            System.out.printf("Entered enclosure "+destinationEnclosure+" not found\n");

    }
    @Override
    public String toString(){
        return "\nThis ZooAnimal model is used to show and allocates enclosures to the animal in the zoo";
    }


    public static void demo() {
        ZooAnimals model = new ZooAnimals();
        System.out.println(model.toString());
        model.add(new Dog_Concrete("Dog", 2, 20));
        model.add(new Zebra_Concrete("Zebra", 4, 10));
        model.add(new Elephant_Concrete("Elephant", 1, 3));
        model.show();
        model.move("Dog", 3);
        model.move("Elephant",4);
        model.move("Zebra",2);
        model.move("asd",3);
        model.move("Dog",10);
        model.show();


    }
}
