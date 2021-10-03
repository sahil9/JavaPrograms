package academy.learnprogramming;

public class Dog_Concrete extends AnimalAPI{
    public Dog_Concrete(String name, int enclosure, int noOfAnimals) {
        super(name, enclosure, noOfAnimals);
    }
    @Override
    public void moving(int enclosure){
        System.out.println("Dog moved from enclosure: "+this.getEnclosure()+" to enclosure: "+enclosure);
        setEnclosure(enclosure);
    }
}
