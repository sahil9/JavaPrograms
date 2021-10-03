package academy.learnprogramming;

public class AbstractAnimalAPI extends ZooAbstractAnimals{

    public AbstractAnimalAPI(int legs, int eyes, String color, boolean isEyeopen, boolean isHungry) {
        super(legs, eyes, color, isEyeopen, isHungry);
    }

    @Override
    void sleep() {
        if(isEyeopen()){
            System.out.println("\nNot sleeping");
        }
        else{
            System.out.println("\nsleeping zzzzz");
        }

    }
    @Override
    void eat() {
        if(isHungry()){
            System.out.println("\nEating");
        }else{
            System.out.println("\nStomach full...not eating");
        }

    }

}
