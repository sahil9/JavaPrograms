package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        userInputChallenge();
    }
    public static void userInputChallenge(){
        int counter = 1;
        int sum = 0;
        System.out.println("Please enter 10 numbers to calculate the sum:");
        while(true){
            System.out.printf("Enter Number#"+counter+" ");
            boolean check = hasNextInt();
            if(check){
                sum +=nextInt();
                counter++;
                if (counter>10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The total sum is: "+ sum);
        scanner.close();



    }
    public static boolean hasNextInt(){
        boolean hasNextInt = scanner.hasNextInt();
        return hasNextInt;
    }
    public static int nextInt(){
        int number = scanner.nextInt();
        return number;
    }
}
