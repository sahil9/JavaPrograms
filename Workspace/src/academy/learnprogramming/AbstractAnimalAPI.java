package academy.learnprogramming;

public abstract class AbstractAnimalAPI {
    private String name;
    private boolean isEyesOpen;
    private boolean isStomachFull;

    public AbstractAnimalAPI(String name, boolean isEyesOpen, boolean isStomachFull) {
        this.name = name;
        this.isEyesOpen = isEyesOpen;
        this.isStomachFull = isStomachFull;
    }
    abstract void eat();
    abstract void sleep();


    public boolean isEyesOpen() {
        return isEyesOpen;
    }

    public boolean isStomachFull() {
        return isStomachFull;
    }

    public void setEyesOpen(boolean eyesOpen) {
        isEyesOpen = eyesOpen;
    }

    public void setStomachFull(boolean stomachFull) {
        isStomachFull = stomachFull;
    }

    public String getName() {
        return name;
    }
}
