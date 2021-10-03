package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(3000);

    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0 ){
            System.out.println("Invlaid value");
        }
        else {
            System.out.println(kiloBytes+ " KB = "+ kiloBytes / 1024 + " MB and " + (kiloBytes - (kiloBytes/1024)*1024) + " KB");
        }

    }
}
