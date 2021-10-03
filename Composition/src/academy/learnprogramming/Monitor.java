package academy.learnprogramming;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("pixel at "+x+" and "+y+" with color"+color);
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
