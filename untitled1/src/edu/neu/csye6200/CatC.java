package edu.neu.csye6200;

public class CatC extends AnimalAPI{
    public CatC() {
        super("Cat", "Meow");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat....Meows");
    }
    @Override
    public String toString(){
        return "Cat";
    }
}
