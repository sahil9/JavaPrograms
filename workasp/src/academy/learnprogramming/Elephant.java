package academy.learnprogramming;

public class Elephant implements AnimalisticAPI{
    private boolean isEyesOpen;
    private boolean isStomachFull;

    public Elephant() {
        this.isEyesOpen = true;
        this.isStomachFull = false;
    }

    @Override
    public void eat() {
        if(isStomachFull){
            System.out.println("Elephant's stomach is full and is not eating");
        }else{
            System.out.println("Elephant is eating");
        }

    }

    @Override
    public void sleep() {
        if(isEyesOpen){
            System.out.println("Elephant is awake");
        }else{
            System.out.println("Elephant is sleeping..zzzzzzzz");
        }

    }

    public boolean isEyesOpen() {
        return isEyesOpen;
    }

    public void setEyesOpen(boolean eyesOpen) {
        isEyesOpen = eyesOpen;
    }

    public boolean isStomachFull() {
        return isStomachFull;
    }

    public void setStomachFull(boolean stomachFull) {
        isStomachFull = stomachFull;
    }
}
