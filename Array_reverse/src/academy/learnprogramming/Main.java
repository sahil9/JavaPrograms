package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] originalArray = {12,45,87,99,1};
        reverseArray(originalArray);
    }
    public static void reverseArray(int[] originalArray){
        int[] reverseArray = new int[originalArray.length];
        int j = originalArray.length-1;
        for(int i = 0; i<originalArray.length; i++ ){
            reverseArray[j] = originalArray[i];
            j--;
        }
        System.out.printf("Original Array"+ Arrays.toString(originalArray));
        System.out.printf("\nReversed Array"+ Arrays.toString(reverseArray));
    }
}
