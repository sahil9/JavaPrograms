package edu.neu.csye6200;

public class LionA implements AnimalisticAPI{
    @Override
    public void hunt() {
        System.out.println("Lion hunts");
    }
    @Override
    public String toString(){
        return "Cat";
    }
}
