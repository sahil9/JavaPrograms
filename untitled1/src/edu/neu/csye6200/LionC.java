package edu.neu.csye6200;

public class LionC extends AnimalAPI {
        public LionC() {
        super("Lion", "Roars");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion......Roars");
    }
    @Override
    public String toString(){
        return "Lion";
    }
}
