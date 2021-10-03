package academy.learnprogramming;

public class AnimalAPI extends ZooAnimals{
    private String name;
    private String animalType;

    public AnimalAPI(int enclosure, String area, String fromcountry, boolean isOpen, String name, String animalType) {
        super(enclosure, area, fromcountry, isOpen);
        this.name = name;
        this.animalType = animalType;
    }

    @Override
    public void moved(int enclosure) {
        System.out.printf("\n"+getName()+" moved to " + enclosure);
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }
}
