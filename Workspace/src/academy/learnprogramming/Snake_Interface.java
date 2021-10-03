package academy.learnprogramming;

public class Snake_Interface implements AnimalisticAPI{

    @Override
    public void sound() {
        System.out.println("Snakes Hiss");

    }

    @Override
    public void move() {
        System.out.println("Snakes crawls");

    }
}
