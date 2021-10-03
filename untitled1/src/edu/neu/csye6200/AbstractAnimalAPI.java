package edu.neu.csye6200;

public abstract class AbstractAnimalAPI {
    private String name;
    private String color;

    public AbstractAnimalAPI(String name, String color)
    {
        this.name=name;
        this.color=color;
    }
    abstract void animalColor();

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }


}
