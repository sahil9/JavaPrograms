package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if((n1<10 || n1>99) || (n2<10 || n2>99))
            return false;
        int digit;
        boolean returnValue =false;
        while(n1>0){
            int number2=n2;
            digit = n1%10;
            while(number2>0){
                if(digit==number2%10){
                    returnValue = true;
                }
                number2/=10;
            }
            n1/=10;
        }
        return returnValue;
    }
}
