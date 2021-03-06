package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(12345678));
    }
    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        int sum=0;
        int digit;
        while(number>0){
            digit = number%10;
            if(digit%2==0){
                sum+=digit;
            }
            number=number/10;
        }
        return sum;
    }
}
