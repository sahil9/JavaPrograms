package academy.learnprogramming;

public class AnimalAPI {
    private String name;
    private int enclosure;
    private int noOfAnimals;

    public AnimalAPI(String name, int enclosure, int noOfAnimals) {
        this.name = name;
        this.enclosure = enclosure;
        this.noOfAnimals = noOfAnimals;
    }

    public void moving(int enclosure){
        System.out.printf(name+" Moved from enclosure: "+this.enclosure+" to enclosure: "+enclosure);
        this.enclosure = enclosure;
    }

    public String getName() {
        return name;
    }

    public int getEnclosure() {
        return enclosure;
    }

    public int getNoOfAnimals() {
        return noOfAnimals;
    }

    public void setEnclosure(int enclosure) {
        this.enclosure = enclosure;
    }


}
