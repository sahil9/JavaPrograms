package academy.learnprogramming;

public class Dog extends Animal implements IAnimal{
    private String size;
    private boolean featherCoating;

    public Dog( String name, int age, boolean isVegetarian, String size, boolean featherCoating) {
        super(name, age, 4, isVegetarian, true);
        this.size = size;
        this.featherCoating = featherCoating;
    }

    public String getSize() {
        return size;
    }

    public boolean isFeatherCoating() {
        return featherCoating;
    }

    @Override
    public void speak(){
        System.out.println("Dog Barks");
    }

    @Override
    public String eat(){
        if(isVegetarian()){
            System.out.println("Dog is eating Chicken");
        }
        else{
            System.out.println("dog is eating salad ");
        }
        return "AnimalEating";
    }



}
