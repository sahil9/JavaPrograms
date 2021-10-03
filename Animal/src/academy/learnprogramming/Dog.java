package academy.learnprogramming;

public class Dog extends Animal  {
    private String name;
    private String size;
    private String breed;
    private String color;

    public Dog(String name, String size, String breed, String color) {
        super(4,2,"Herbivorous","Cities",true,true,false,true);
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak(){
        System.out.println("\n"+name+" Dog Barks.....");
    }

    @Override
    public void move() {
        System.out.println("Dog is running on his four legs");
    }

    @Override
    public String eat() {
        if(isStomachfull()){
            System.out.println(name+" Stomach full ... not eating");
            return "AnimalNotEating";
        }
        else{
            System.out.println(name+ " Eating");
            return "AnimalEating";
        }
    }
    @Override
    public String toString(){
        String details = "Dog: Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color;
        return details;
    }

    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
}