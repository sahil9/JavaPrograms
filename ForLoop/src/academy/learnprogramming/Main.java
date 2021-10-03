package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int range = 100;
        int start = 1;
        int count = 0;
        for (int i = start; i <= range; i++){

            if (isPrime(i)){
                count++;
            }
            if (count >= 5)
            break;
        }
        System.out.println("total prime= "+ count);
    }

    public static boolean isPrime(int number){
        if (number <= 1)
            return false;
        for (int i = 2; i<number; i++){
            if (number%i == 0)
                return false;
        }
        return true;
    }
}

