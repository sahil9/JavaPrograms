package academy.learnprogramming;

import java.sql.SQLOutput;

public class Dog_Interface implements AnimalisticAPI {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void move() {
        System.out.println("Dog walks and run");

    }
}
