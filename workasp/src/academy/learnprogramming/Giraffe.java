package academy.learnprogramming;

public class Giraffe implements AnimalisticAPI {
    private boolean isEyesOpen;
    private boolean isStomachFull;

    public Giraffe() {
        this.isEyesOpen = true;
        this.isStomachFull = false;
    }

    @Override
    public void eat() {
        if (isStomachFull) {
            System.out.println("Giraffe's stomach is full and is not eating");
        } else {
            System.out.println("Giraffe is eating");
        }

    }

    @Override
    public void sleep() {
        if (isEyesOpen) {
            System.out.println("Giraffe is awake");
        } else {
            System.out.println("Giraffe is sleeping..zzzzzzzz");
        }

    }

    @Override
    public boolean isEyesOpen() {
        return isEyesOpen;
    }

    @Override
    public boolean isStomachFull() {
        return isStomachFull;
    }

    @Override
    public void setStomachFull(boolean stomachFull) {
        isStomachFull = stomachFull;

    }

    @Override
    public void setEyesOpen(boolean eyesOpen) {
        isEyesOpen = eyesOpen;


    }
}
