package edu.neu.csye6200;

public class LionB extends AbstractAnimalAPI {
    public LionB(){
        super("Lion","brown");
    }
    @Override
    public void animalColor(){
        System.out.println("Lion is of brown in color");
    }
    @Override
    public String toString(){
        return "Lion";
    }
}
