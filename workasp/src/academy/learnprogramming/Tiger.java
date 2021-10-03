package academy.learnprogramming;

public class Tiger implements AnimalisticAPI {
    private boolean isEyesOpen;
    private boolean isStomachFull;

    public Tiger() {
        this.isEyesOpen = true;
        this.isStomachFull = false;
    }

    @Override
    public void eat() {
        if (isStomachFull) {
            System.out.println("Tiger's stomach is full and is not eating");
        } else {
            System.out.println("Tiger is eating");
        }

    }

    @Override
    public void sleep() {
        if (isEyesOpen) {
            System.out.println("Tiger is awake");
        } else {
            System.out.println("Tiger is sleeping..zzzzzzzz");
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
