package academy.learnprogramming;

public class DogAbstract extends AbstractAnimalAPI{
    public DogAbstract(int enclosure, int noOfAnimal) {
            super("Dog", enclosure, noOfAnimal);

    }

    @Override
    public void moved(int enclosure) {
        System.out.println("\nMoving Dog from enclosure: "+this.getEnclosure()+" to enclosure: "+enclosure);
        this.setEnclosure(enclosure);
    }
    public String getName() {
        return "Dog";
    }



}
