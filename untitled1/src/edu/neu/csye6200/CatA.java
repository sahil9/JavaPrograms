package edu.neu.csye6200;

public class CatA implements AnimalisticAPI{

    @Override
    public void hunt() {
        System.out.println("Cat does not hunt");
    }

    @Override
    public String toString(){
        return "Cat";
    }
}
