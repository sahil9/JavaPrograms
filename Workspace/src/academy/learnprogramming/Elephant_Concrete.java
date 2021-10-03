package academy.learnprogramming;

public class Elephant_Concrete extends AnimalAPI{
    public Elephant_Concrete(String name, int enclosure, int noOfAnimals) {
        super(name, enclosure, noOfAnimals);
    }

    @Override
    public void moving(int enclosure){
        System.out.println("Elephant moved from enclosure: "+this.getEnclosure()+" to enclosure: "+enclosure);
        setEnclosure(enclosure);
    }
}
