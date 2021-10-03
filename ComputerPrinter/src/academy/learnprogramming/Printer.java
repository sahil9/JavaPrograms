package academy.learnprogramming;

public class Printer {
    private int tonerLevel = 0;
    private int noOfPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public Printer(boolean duplexPrinter) {
        this(0,0, duplexPrinter);
        this.duplexPrinter = duplexPrinter;
    }


    public void fillToner(int number){
        if((tonerLevel+number)>100){
            tonerLevel = 100;
        }else
            tonerLevel+=number;
        System.out.println("Toner filled: "+tonerLevel);
    }
    public void printing(int pages){
        if (duplexPrinter){
            noOfPagesPrinted += pages/2;
        }
        else{
            noOfPagesPrinted +=pages;
        }
        System.out.println(pages+" no of pages printed....total no pages printed = "+noOfPagesPrinted);
    }

}
