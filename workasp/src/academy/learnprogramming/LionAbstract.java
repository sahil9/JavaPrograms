package academy.learnprogramming;

public class LionAbstract extends AbstractAnimalAPI{
    public LionAbstract( int enclosure, int noOfAnimal) {
        super("Lion", enclosure, noOfAnimal);
    }
    @Override
    void moved(int enclosure) {
        System.out.println("\nMoving Cat from enclosure: "+this.getEnclosure()+" to enclosure: "+enclosure);
        this.setEnclosure(enclosure);

    }

}
