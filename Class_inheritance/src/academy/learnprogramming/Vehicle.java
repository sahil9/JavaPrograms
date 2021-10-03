package academy.learnprogramming;

public class Vehicle {
    private String name;
    private int wheels;
    private int gears;
    private String color;

    public Vehicle(String name, int wheels, int gears, String color) {
        this.name = name;
        this.wheels = wheels;
        this.gears = gears;
        this.color = color;
    }
    public steering(){
        System.out.println("vehicle.steering");
    }
    public changingGear(){
        System.out.println("vehicle.changing gears");
    }
    public moving(){
        System.out.println("vehicle.moving");
    }
    //setters and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
