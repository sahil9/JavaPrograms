package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumdigit(9999999999L));
	// write your code here
    }
    public static long sumdigit(long number){
        long sum = 0;
        long digit;
        while (number > 0){
            digit =  number%10L;
            sum = sum + digit;
            number =  number/10L;
        }
        return sum;

    }
}
