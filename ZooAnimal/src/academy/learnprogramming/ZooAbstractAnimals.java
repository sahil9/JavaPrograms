package academy.learnprogramming;

public abstract class ZooAbstractAnimals {

    private int legs;
    private int eyes;
    private String color;
    private boolean isEyeopen;
    private boolean isHungry;

    public ZooAbstractAnimals(int legs, int eyes, String color, boolean isEyeopen, boolean isHungry) {
        this.legs = legs;
        this.eyes = eyes;
        this.color = color;
        this.isEyeopen = isEyeopen;
        this.isHungry = isHungry;
    }

    abstract void eat();
    abstract void sleep();

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }


    public String getColor() {
        return color;
    }

    public boolean isEyeopen() {
        return isEyeopen;
    }

    public boolean isHungry() {
        return isHungry;
    }
}
