package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double myno = 20.00d;
        double secno = 80.00d;
        double total = (myno + secno) * 100d;
        double rem = total % 40.00d;
        boolean check = (rem == 0) ? true:false;
        System.out.println(check);
        if (!check){
            System.out.println("Got some remainder");
        }


    }
}
