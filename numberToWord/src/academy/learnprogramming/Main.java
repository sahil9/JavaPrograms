package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(bitCount(12345));
        System.out.println(reverseNumber(12345));
        numbersToWords(12345);
    }

    public static int bitCount(int number){
        int count = 0;
        while(number>0){
            count++;
            number /=10;
        }
        return count;
    }
    public static double reverseNumber(int number){
        int digits=bitCount(number);
        double reverse =0;
        while(number>0){
            digits--;
            reverse += (number%10) * Math.pow(10,digits);
            number/=10;
        }
        return reverse;

    }
    public static void numbersToWords(int number){
        int reversed = (int) reverseNumber(number);
        String name = null;
        String finalString = "";
        while(reversed>0){
            int digit = reversed%10;
            switch (digit){
                case 0:
                    name = "Zero";
                    break;
                case 1:
                    name = "one";
                    break;
                case 2:
                    name = "two";
                    break;
                case 3:
                    name = "three";
                    break;
                case 4:
                    name = "four";
                    break;
                case 5:
                    name = "five";
                    break;
            }
            reversed/=10;
            finalString = finalString + name;

        }
        System.out.println(finalString);

    }


}
