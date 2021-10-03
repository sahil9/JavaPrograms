package academy.learnprogramming;

public class Monkey_Interface implements AnimalisticAPI{


    @Override
    public void sound() {
        System.out.println("Monkey squeaks");

    }

    @Override
    public void move() {
        System.out.println("Monkey Climbs");

    }
}
