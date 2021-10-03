package edu.neu.csye6200;

public class AnimalAPI {
    private String name;
    private String sound;

    public AnimalAPI(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name+" ...."+sound+"....");
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
