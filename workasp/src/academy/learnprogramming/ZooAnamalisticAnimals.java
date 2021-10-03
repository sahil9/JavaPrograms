package academy.learnprogramming;

public class ZooAnamalisticAnimals {

    public void toggleEyes(AnimalisticAPI animal){
        if (animal.isEyesOpen()){
            animal.setEyesOpen(false);
        }else
            animal.setEyesOpen(true);
    }
    public void toggleIsStomachFull(AnimalisticAPI animal){
        if (animal.isStomachFull()) {
            animal.setStomachFull(false);
        } else
            animal.setStomachFull(true);
    }
    public void showWhoIsEating(AnimalisticAPI[] animal){
        System.out.println("Checking which animal is hungry and still eating: ");
        for (int i=0; i<animal.length;i++){
            animal[i].eat();
        }
    }
    public void showWhoisSleeping(AnimalisticAPI[] animal){
        System.out.printf("Checking which Animal is sleeping or awake: \n");
        for (int i=0; i<animal.length;i++){
            animal[i].sleep();
        }
    }


    public static void demo(){
        ZooAnamalisticAnimals model = new ZooAnamalisticAnimals();
        AnimalisticAPI[] animalList = {new Elephant(), new Tiger(), new Giraffe()};
        
      //  animalList = {new Elephant(), new Tiger(), new Giraffe()}
//        AnimalisticAPI animal;
//        animal = new Elephant();
//        animal.eat();
//        animal.sleep();
        model.showWhoIsEating(animalList);
        System.out.printf("\n");

        model.showWhoisSleeping(animalList);
        model.toggleEyes(animalList[0]);
        model.toggleIsStomachFull(animalList[1]);
        model.toggleIsStomachFull(animalList[0]);
        System.out.printf("\n");
        model.showWhoIsEating(animalList);
        System.out.printf("\n");

        model.showWhoisSleeping(animalList);


    }
}
