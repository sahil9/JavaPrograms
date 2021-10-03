package academy.learnprogramming;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-123221));
	// write your code here
    }
    public static boolean isPalindrome(int n){
        double reverse = 0;
        int originalNumber = n;
        int negNumber = Math.abs(n);
        double noOfDigits = 0;
        int a = Math.abs(n);
        while(a >0){
            noOfDigits++;
            a = a/10;
        }
        while (negNumber>0){
            int digit = negNumber%10;
            noOfDigits--;
            reverse = reverse+ digit* Math.pow(10.00,noOfDigits);
            negNumber = negNumber/10;
        }
        System.out.println(reverse);
        if (Math.abs(originalNumber) == reverse)
            return true;
        else
            return false;
    }
}
