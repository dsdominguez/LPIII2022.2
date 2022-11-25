package Animal;

import java.util.ArrayList;
import java.util.List;

public class PolimorphicAnimals {
    public static void main(String[] args) {
        List<Animal> myAnimals = new ArrayList<>(); // Create a Animal List
        myAnimals.add(new Dog("Jonhy")); //Create a dog, and add to List
        myAnimals.add(new Cat("Sony"));  //Create a cat, and add to List
        myAnimals.add(new Pig("Piggy")); //Create a pig, and add to List

        //Listing animals sounds
        for(Animal item: myAnimals) {
            System.out.println(item.animalSound());
        }
    }
}
