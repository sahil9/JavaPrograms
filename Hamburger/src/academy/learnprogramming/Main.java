package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("elephant",50,4,true,true);
        Dog dog1 = new Dog("dog1",5,false,"big",true);

        System.out.println("dog1 Age:"+dog1.getAge());
        System.out.println("Eye open = "+dog1.isEyeOpen());
        animal.speak();
        dog1.speak();
        dog1.eat();
        dog1.grow();
        dog1.sleep();
        System.out.println("Eye open = "+dog1.isEyeOpen());

    }
}
