package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, -1));
	// write your code here
    }
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if (hourOfDay > 23 || hourOfDay < 0){
            return false;
        }
        else{
            if (barking == true && (hourOfDay< 8 || hourOfDay >22)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
