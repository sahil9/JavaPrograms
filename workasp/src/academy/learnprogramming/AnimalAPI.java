package academy.learnprogramming;

public class AnimalAPI {
    private String name;
    private String sound;
    public void speak(){
        System.out.println("......sound......");
    }
    public AnimalAPI(){

    }
    public AnimalAPI(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

}
