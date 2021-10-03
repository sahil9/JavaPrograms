package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard("B-420","Asus",4,2);
        Resolution nativeResolution = new Resolution(10,20);
        Monitor monitor = new Monitor("IPS","BENQ",nativeResolution);
        Dimensions dimension = new Dimensions(6,7);
        Case theCase = new Case("Tall","Antec", dimension);
        PC thePC = new PC(motherBoard,monitor,theCase);
        thePC.getTheCase().pressPowerButton();
        thePC.getMotherBoard().loadProgram("Windows");
        thePC.getMonitor().drawPixelAt(1000,2000,"Blue");
        thePC.getMonitor().drawPixelAt(100,200,"Red");


    }
}
