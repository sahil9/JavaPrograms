package academy.learnprogramming;

public class Monkey_Abstract extends AbstractAnimalAPI{
    public Monkey_Abstract() {
        super("Monkey", true, false);
    }
    @Override
    public void eat(){
        if (isStomachFull()){
            System.out.println(getName()+" stomach is full and is not eating");
        }
        else
            System.out.println(getName()+" is eating");
    }

    @Override
    public void sleep(){
        if (isEyesOpen()){
            System.out.printf(getName()+" is awake\n");
        }
        else
            System.out.println(getName()+" is sleeping zzzzz");
    }
}
