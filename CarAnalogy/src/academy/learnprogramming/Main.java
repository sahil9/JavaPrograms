package academy.learnprogramming;


public class Car{
    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinder){
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Engine Started...");
    }
    public void accelerate(int speed){
        System.out.println("accelerated to "+speed+" kmph");
    }
    public void brake(){
        System.out.println("brakes applied....");
    }
}
public class Lamborghini extends Car{
    private String model;

    public Lamborghini(String name, int cylinder, String model) {
        super(name, cylinder);
        this.model = model;
    }
    @Override
    private startEngine(){
        System.out.println(".......BOOM.......");
    }
}
public class Tesla extends Car{
    private int model;
    private int chargedPercent;

    public Tesla(String name, int cylinder, String model, int chargedPercent){
        super(name,cylinder);
        this.model = model;
        this.chargedPercent = chargedPercent;
    }
    @Override
    public void accelerate(int speed){
        if (chargedPercent >0){
            System.out.println("...zoom..."+speed);
        }else{
            System.out.println("not sufficient charge");
        }

    }


}

public class Main {

    public static void main(String[] args) {


    }
}
