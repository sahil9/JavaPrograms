package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;

public class ZooAnimalisticAnimal {
    public ArrayList<AnimalisticAPI> animalisticAnimal = new ArrayList<>();
    public void add(AnimalisticAPI animal) {
        this.animalisticAnimal.add(animal);
    }


        public void show() {
            System.out.println("The mentioned animals can hunt");
            for (AnimalisticAPI animal : animalisticAnimal) {
                System.out.println(animal);
            }
        }
            public void animalHunt() {
                for (AnimalisticAPI animal : animalisticAnimal) {
                    animal.hunt();
                }
            }
                @Override
                public String toString(){
                    return "\nThis ZooAnimalistic model determine the what sound animal in the zoo makes and their moving style";
                }

        public static void demo(){
            ZooAnimalisticAnimal model=new ZooAnimalisticAnimal();
            model.add(new CatA());
            model.add(new DogA());
            model.add(new LionA());
            model.show();
            model.animalHunt();
        }
    }


