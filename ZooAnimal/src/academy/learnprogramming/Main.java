package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //
        ZooAnamalisticAnimals IAnimal = new AnimalisticAPI("Bark",5,false);
        IAnimal.speak();
        ZooAnimals animal = new AnimalAPI(3,"North","USA",true,"John","dog");
        animal.moved(5);
        ZooAbstractAnimals abstractAnimal = new AbstractAnimalAPI(4,2,"black",true,true);
        abstractAnimal.eat();
        AnimalAPI animal1 = new AnimalAPI(1,"North","Africa",false,"Simba","lion");
        AnimalAPI animal2 = new AnimalAPI(2,"North","USA",false,"ABC","elephant");
        AnimalAPI animal3 = new AnimalAPI(2,"North","USA",false,"XYZ","dog");
        AnimalAPI animal4 = new AnimalAPI(2,"North","USA",false,"asd","pecock");
        AnimalAPI animal5 = new AnimalAPI(3,"North","USA",false,"asd","fox");

        AnimalAPI[] animal_all = { animal1, animal2, animal3, animal4, animal5};
        for (int i = 1; i<5;i++){
            System.out.printf("\n\nBelow are the animals is enclosure: "+i);
            int j= 0;
            for (j =0;j<animal_all.length;j++){
                if (animal_all[j].getEnclosure() == i){
                    System.out.printf("\n"+animal_all[j].getAnimalType()+ " : "+animal_all[j].getName());
            }

            }
        }
    }
}
