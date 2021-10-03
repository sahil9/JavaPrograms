package academy.learnprogramming;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(2,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int sum = 0;
        int BigCount=0;
        boolean conditionMet = false;
        for (int i = 0; i<=bigCount; i++){
            int smallSum = 0;
            sum = i*5;
            if(sum==goal) {
                conditionMet = true;
                break;
            }
            for(int j = 1 ; j<=smallCount;j++){
                smallSum = sum + j;
                if (smallSum == goal){
                    conditionMet = true;
                    break;
                }

            }
            if (conditionMet == true)
                break;
        }
        return conditionMet;
    }
}
