package academy.learnprogramming;

import java.sql.SQLOutput;

public class Animal implements IAnimal {
    private String name;
    private int age;
    private int legs;
    private boolean isVegetarian;
    private boolean isEyeOpen;

    public Animal(String name, int age, int legs, boolean isVegetarian, boolean isEyeOpen) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.isVegetarian = isVegetarian;
        this.isEyeOpen = isEyeOpen;
    }

    @Override
    public void move() {
        System.out.println("Animal moving");
    }

    @Override
    public void speak() {
        System.out.println("Animal speaking");

    }

    @Override
    public String eat() {
        System.out.println("Animal eating");
        return "AnimalEating";
    }

    @Override
    public void grow() {
        if(this.eat().equals("AnimalEating") ){
            this.age +=1;
        }
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzzzzzz");
        isEyeOpen = false;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public boolean isEyeOpen() {
        return isEyeOpen;
    }
}
