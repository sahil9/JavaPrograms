package edu.neu.csye6200;

public class DogB extends AbstractAnimalAPI{
    public DogB(){
        super("Dog","black");
    }
    @Override
    public void animalColor(){
        System.out.println("Dog is of black in color");
    }
    @Override
    public String toString(){
        return "Dog";
    }
}
