package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {

    private List<AnimalAPI> animalList = new ArrayList<>();


    public void add(AnimalAPI animal){
        this.animalList.add(animal);
    }

    public void show(){
        System.out.println(this.animalList.size()+" Animals in the zoo");
        for(AnimalAPI animal : animalList){
            animal.speak();
        }
    }

    public static void demo(){

        AnimalAPI animal;
        System.out.println("\nZooAnimal demo started ......\n");
        ZooAnimals model = new ZooAnimals();

        model.add(new Dog());
        model.add(new Cat_Concrete());
        model.add(new Lion_Concrete());

        model.show();

        System.out.println("\nZooAnimal demo ended ......");

    }


}
