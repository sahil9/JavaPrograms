package academy.learnprogramming;

//import java.sql.SQLOutput;

public class Animal implements IAnimal {
    private int legs;
    private int eyes;
    private String type;
    private String commonlyfoundin;
    private boolean tail;
    private boolean isEyeOpen;
    private boolean petable;
    private boolean isStomachfull;


    public Animal(int legs, int eyes, String type, String commonlyfoundin, boolean tail, boolean petable, boolean isStomachfull, boolean isEyeOpen) {
        this.legs = legs;
        this.eyes = eyes;
        this.type = type;
        this.commonlyfoundin = commonlyfoundin;
        this.tail = tail;
        this.petable = petable;
        this.isStomachfull = isStomachfull;
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
        System.out.println("Growing");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzzzzzz");
        isEyeOpen = false;

    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public String getType() {
        return type;
    }

    public String getCommonlyfoundin() {
        return commonlyfoundin;
    }

    public boolean isTail() {
        return tail;
    }

    public boolean isEyeOpen() {
        return isEyeOpen;
    }

    public boolean isStomachfull() {
        return isStomachfull;
    }

    public boolean isPetable() {
        return petable;
    }

    public void setEyeOpen(boolean eyeOpen) {
        isEyeOpen = eyeOpen;
    }

    public void setStomachfull(boolean stomachfull) {
        isStomachfull = stomachfull;
    }
}
