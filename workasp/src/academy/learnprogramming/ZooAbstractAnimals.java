package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
    private List<AbstractAnimalAPI> animalList = new ArrayList<>();
    private AbstractAnimalAPI[] animalList2 = new AbstractAnimalAPI[5];

    public void add(AbstractAnimalAPI animal){
        this.animalList.add(animal);
    }
    public void move(AbstractAnimalAPI animal, int en){
        System.out.println("\nMoving"+animal.getName()+" from enclosure: "+animal.getEnclosure()+"to enclosure: "+en);
        animal.setEnclosure(en);
    }

    public void show(int totalenclosure) {
        System.out.println("\nThere are total "+totalenclosure+" enclosures in a Zoo and below are the animals is respective enclosure\n");

        for (int i = 1; i <=totalenclosure; i++) {
            System.out.printf("Enclosure " + i+":\n");
            int j = 0;
            for (j = 0; j < animalList.size(); j++) {
                if (i == animalList.get(j).getEnclosure()) {
                    System.out.println( animalList.get(j).getName() + " : " + animalList.get(j).getNoOfAnimal());

                }
            }
        }
    }
    public static void demo(){

        System.out.println("\n::::::: AbstractAnimal Demo Started::::::::\n");
        int totalNoOfenclosures = 5;

        AbstractAnimalAPI animal, animal2, animal3;
        animal = new DogAbstract(1,10);
        animal2 = new Cat(2,5);
        animal3 = new LionAbstract(3,2);

        ZooAbstractAnimals model = new ZooAbstractAnimals();
        model.add(animal);
        model.add(animal2);
        model.add(animal3);
        model.show(totalNoOfenclosures);
        animal.moved(3);
        animal2.moved(5);
        animal3.moved(1);
        model.show(totalNoOfenclosures);



        System.out.println("\n\n::::::: AbstractAnimal Demo Ended::::::::");

    }




}
