package academy.learnprogramming;

public class AnimalisticAPI implements ZooAnamalisticAnimals {
    private String sound;
    private int age;
    private boolean isCarnovorous;

    public AnimalisticAPI(String sound, int age, boolean isCarnovorous) {
        this.sound = sound;
        this.age = age;
        this.isCarnovorous = isCarnovorous;
    }

    @Override
    public void hunts() {
        if (isCarnovorous){
            System.out.println("\nHunting");
        }
        else{
            System.out.println("\nNot hunting");
        }
    }

    @Override
    public void speak() {
        System.out.printf(sound+" "+sound);

    }

    @Override
    public void grow() {
        age+=1;
        System.out.println("\nAnimal is growing and current Age = "+age);

    }

    public String getSound() {
        return sound;
    }

    public int getAge() {
        return age;
    }

    public boolean isCarnovorous() {
        return isCarnovorous;
    }


}