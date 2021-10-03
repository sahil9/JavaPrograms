package academy.learnprogramming;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String program){
        System.out.println("The program" + program+" is loading...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getBios() {
        return bios;
    }
}
