package academy.learnprogramming;

import java.awt.*;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacturer, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("power Button pressed");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
