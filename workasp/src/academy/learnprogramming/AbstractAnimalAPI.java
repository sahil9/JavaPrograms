package academy.learnprogramming;

public abstract class  AbstractAnimalAPI {
    private String name;
    private int enclosure;
    private int noOfAnimal;

    public AbstractAnimalAPI(){

    }
    public AbstractAnimalAPI(String name, int enclosure, int noOfAnimal) {
        this.name = name;
        this.enclosure = enclosure;
        this.noOfAnimal = noOfAnimal;
    }


//    public void moved(int enclosure){
//        System.out.println("\nMoving "+name+" from enclosure: "+this.enclosure+" to enclosure: "+enclosure);
//        this.enclosure = enclosure;
//    }
    abstract void moved(int enclosure);
//    abstract String getName();
//    abstract int getEnclosure();
//    abstract int getNoOfAnimal()



    public String getName() {
        return name;
    }

    public int getEnclosure() {
        return enclosure;
    }

    public int getNoOfAnimal() {
        return noOfAnimal;
    }


    public void setEnclosure(int enclosure) {
        this.enclosure = enclosure;
    }
}
