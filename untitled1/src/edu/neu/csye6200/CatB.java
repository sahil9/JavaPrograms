package edu.neu.csye6200;

public class CatB extends AbstractAnimalAPI{
    public CatB(){
        super("Cat","white");
    }
    @Override
    public void animalColor(){
        System.out.println("Cat is of white in color");
    }
    @Override
    public String toString(){
        return "Cat";
    }
}
