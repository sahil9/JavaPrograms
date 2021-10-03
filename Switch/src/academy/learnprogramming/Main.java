package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printNumberInWords(9);
	// write your code here
    }
    public static void printNumberInWords(int number){
        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("3-6");
                break;
            default:
                System.out.println("others");
                break;
        }
    }
}
