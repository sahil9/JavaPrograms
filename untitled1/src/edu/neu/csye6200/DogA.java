package edu.neu.csye6200;

public class DogA implements AnimalisticAPI {
    @Override
    public void hunt() {
        System.out.println("Dog does not hunt");
    }

    @Override
    public String toString(){
        return "Dog";
    }
}
