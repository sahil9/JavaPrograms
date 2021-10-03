package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
    private List<AbstractAnimalAPI> animalList = new ArrayList<>();

    public void add(AbstractAnimalAPI animals) {
        this.animalList.add(animals);
    }
    public void isEating(){
        System.out.println("\nBelow are the list of animals which are eating: ");
        for (AbstractAnimalAPI animals : animalList){
            animals.eat();
        }
    }
    public void isSleeping(){
        System.out.println("\nBelow are the list of animals which are sleeping or awake: ");
        for (AbstractAnimalAPI animals : animalList){
            animals.sleep();
        }
    }
    public void toggleisEyesOpen(String name){
        int count = 0;
        for (AbstractAnimalAPI animals : animalList){
            if (animals.getName() == name){
                count++;
                if(animals.isEyesOpen()){
                    animals.setEyesOpen(false);
                }else
                    animals.setEyesOpen(true);
            }
        }
        if(count == 0 ){
            System.out.println("\nEntered Animal "+ name + " is not present in the Zoo");
        }
    }
    public void toggleisStomachFull(String name){
        int count =0;
        for (AbstractAnimalAPI animals : animalList){
            if (animals.getName() == name){
                count ++;
                if(animals.isStomachFull()){
                    animals.setStomachFull(false);
                }else
                    animals.setStomachFull(true);
            }
        }
        if(count == 0 ){
            System.out.println("\nEntered Animal "+ name + " is not present in the Zoo");
        }

    }
    public String toString(){
        return "\nThis ZooAbstract model is to determine which animals in the Zoo are sleeping and eating";
    }

    public static void demo(){
        ZooAbstractAnimals model = new ZooAbstractAnimals();
        System.out.println(model.toString());
        model.add(new Giraffe_Abstract() );
        model.add(new Tiger_Abstract());
        model.add(new Monkey_Abstract());
        model.isEating();
        model.isSleeping();
        model.toggleisEyesOpen("Tiger");
        model.toggleisEyesOpen("Lion");

        model.toggleisStomachFull("Giraffe");
        model.isEating();
        model.isSleeping();

    }
}
