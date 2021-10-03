package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer1 = new Printer(true);
        Printer printer2 = new Printer(false);
        printer1.fillToner(50);
        printer1.printing(20);
        printer2.fillToner(200);
        printer2.printing(50);

    }
}
