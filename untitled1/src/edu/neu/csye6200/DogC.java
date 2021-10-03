package edu.neu.csye6200;

public class DogC extends AnimalAPI{
    public DogC() {
        super("Dog", "Barks");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog.....Barks");
    }
    @Override
    public String toString(){
        return "Dog";
    }
}
