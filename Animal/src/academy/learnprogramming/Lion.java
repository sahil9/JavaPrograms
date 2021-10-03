package academy.learnprogramming;

public class Lion extends Animal implements IAnimal{
    private String name;
    private String location;
    private int weigth;
    private boolean spots;

    public Lion(String name, String location, int weigth, boolean spots) {
        super(4, 2, "Carnivorous", "Jungle", true, false,false, true);
        this.location = location;
        this.weigth = weigth;
        this.spots = spots;
        this.name = name;
    }



    @Override
    public void move() {
        System.out.println(name+" Hunts");
    }

    @Override
    public void speak() {
        System.out.println(name+" roars....");
    }

    @Override
    public String eat() {
        if(isStomachfull()){
            System.out.println(name+" stomach full ... not eating");
            return "AnimalNotEating";
        }
        else{
            System.out.println("Eating");
            return "AnimalEating";
        }
    }

    public String getLocation() {
        return location;
    }

    public int getWeigth() {
        return weigth;
    }

    public boolean isSpots() {
        return spots;
    }
    @Override
    public String toString(){
        return "Lion: Name: "+name+", Location: "+location+", Weight: "+weigth;
    }
}
