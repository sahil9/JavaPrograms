package edu.neu.csye6200;
import java.util.ArrayList;
public class ZooAbstractAnimal {
    public ArrayList<AbstractAnimalAPI> abstractAnimal = new ArrayList<>();

    public void add(AbstractAnimalAPI animal) {
        this.abstractAnimal.add(animal);
    }

    public void show() {
        System.out.println("The mentioned animals are if these colors");
        for (AbstractAnimalAPI animal : abstractAnimal) {
            System.out.println(animal);
        }

    }

    public void animalColor() {
        for (AbstractAnimalAPI animal : abstractAnimal) {
            animal.animalColor();
        }
    }


    public static void demo(){
        ZooAbstractAnimal model=new ZooAbstractAnimal();
        model.add(new CatB());
        model.add(new DogB());
        model.add(new LionB());
        model.show();
        model.animalColor();
    }
}

