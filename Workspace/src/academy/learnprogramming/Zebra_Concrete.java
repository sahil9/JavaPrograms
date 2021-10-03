package academy.learnprogramming;

public class Zebra_Concrete extends AnimalAPI{
    public Zebra_Concrete(String name, int enclosure, int noOfAnimals) {
        super(name, enclosure, noOfAnimals);
    }
    @Override
    public void moving(int enclosure){
        System.out.println("Zebra moved from enclosure: "+this.getEnclosure()+" to enclosure: "+enclosure);
        setEnclosure(enclosure);
    }
}
