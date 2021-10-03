package academy.learnprogramming;

public class Cat extends AbstractAnimalAPI {
    public Cat( int enclosure, int noOfAnimal) {
        super("Cat", enclosure, noOfAnimal);
    }

    @Override
    void moved(int enclosure) {
        System.out.println("\nMoving Cat from enclosure: "+this.getEnclosure()+" to enclosure: "+enclosure);
        this.setEnclosure(enclosure);

    }
}
