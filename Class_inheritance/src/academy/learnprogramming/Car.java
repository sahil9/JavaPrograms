package academy.learnprogramming;

public class Car extends Vehicle{
    private String model;
    private boolean sunRoof;


    public Car(String name, int wheels, int gears, String color, String model) {
        super(name, wheels, gears, color);
        this.model = model;
    }

    public Car(String name, int wheels, int gears, String color, String model, boolean sunRoof) {
        super(name, wheels, gears, color);
        this.model = model;
        this.sunRoof = sunRoof;
    }

    public speed(){
        System.out.println("car.spped, km/h");
    }


}
