package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Enter the size for the array ");
        int count = scanner.nextInt();
        System.out.printf("Min value: "+findMin(readInteger(count)) );

    }

    public static int[] readInteger(int count){
        int[] myarray = new int[count];

        System.out.println("Enter "+count+" integers for an array:");
        for(int i=0;i<count;i++){
            myarray[i] = scanner.nextInt();
        }
//        System.out.println("Below are the array :");
//        for(int i = 0; i<myarray.length; i++){
//            System.out.println(myarray[i]);

        return myarray;
    }

    public static int findMin(int[] myArray){
        int minValue = myArray[0];
        for(int i = 0; i<myArray.length; i++){
            if(myArray[i]<minValue){
                minValue = myArray[i];
            }
        }
        return minValue;
    }


}
