package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("John","Big","Labrador","Brown");
        Dog dog2 = new Dog("Snow","Small","Bulldog","Black");
        Lion lion1 = new Lion("Simba", "India", 30,false);
        Lion lion2 = new Lion("Aslan", "Africa",40,true);
        dog1.setStomachfull(false);
        dog1.eat();
        dog2.setStomachfull(true);
        dog2.eat();


        //DOG class as an API
        Dog[] dog = {dog1,dog2};
        System.out.printf("\n\nThere are two Dogs below are the details: \n");
        for (int i = 0; i<dog.length;i++){
            System.out.printf(dog[i].toString()+"\n");
        }
        // Interface as an API
        IAnimal ob;
        ob = new Lion("Sheru","Africa",50,true);;
        System.out.printf("Below are the details of Lion\n");
        System.out.printf(ob.toString());
        ob = dog1;
        ob.speak();

        //Animal class as an API
        Animal animal;
        animal = new Dog("xyz","small","abc","black");
        animal.speak();



        }


    }



