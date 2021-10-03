package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ZooAnamalisticAnimals {
    private List<AnimalisticAPI> animalList = new ArrayList<>();

    public void add(AnimalisticAPI animals) {
        this.animalList.add(animals);
    }
    public void soundMakes(){
        System.out.println("\nBelow are the sound that the respective animal makes");
        for (AnimalisticAPI animals: animalList){
            animals.sound();
        }
    }
    public void movingStyle(){
        System.out.println("\nBelow are the moving style of animals in the zoo");
        for (AnimalisticAPI animals: animalList){
            animals.move();
        }
    }
    @Override
    public String toString(){
        return "\nThis ZooAnimalistic model determine the what sound animal in the zoo makes and their moving style";
    }
    public static void demo(){
        ZooAnamalisticAnimals model = new ZooAnamalisticAnimals();
        System.out.println(model.toString());
        model.add(new Monkey_Interface());
        model.add(new Dog_Interface());
        model.add(new Snake_Interface());

        model.soundMakes();
        model.movingStyle();


    }
}
