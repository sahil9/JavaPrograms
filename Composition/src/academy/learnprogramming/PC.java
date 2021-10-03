package academy.learnprogramming;

public class PC {
    private MotherBoard motherBoard;
    private Monitor monitor;
    private Case theCase;

    public PC(MotherBoard motherBoard, Monitor monitor, Case theCase) {
        this.motherBoard = motherBoard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getTheCase() {
        return theCase;
    }
}
