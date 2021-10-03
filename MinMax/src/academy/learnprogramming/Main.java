package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    static  Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        minAndMaxInputChallenge();
    }

    public static void minAndMaxInputChallenge() {
        int counter = 0;
        int min=0;
        int max = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter the number below and press any letter to exit");

            boolean isAntInt = scanner.hasNextInt();
            if (isAntInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }

                if (number<min){
                    min = number;
                }

            } else {
                System.out.println("Breaking out");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The minimum number is: "+min);
        System.out.println("The maximum number is: "+max);
        scanner.close();
    }
}
