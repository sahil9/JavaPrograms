package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
	// write your code here
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter = 0;
        while(true){
            boolean check = scanner.hasNextInt();
            if (check){
                int number = scanner.nextInt();
                sum+=number;
                counter++;
            }else{
                break;
            }
            scanner.nextLine();
        }
        avg = Math.round(sum/counter);
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();

    }
}
