package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;
        int first=0;
        int digit = 0;
        int firstDigit = 0;
        while(number>0){
            digit = number%10;
            if(first == 0){
                firstDigit = digit;
                first++;
            }
            number /= 10;
        }
        return (firstDigit + digit);
    }
}
