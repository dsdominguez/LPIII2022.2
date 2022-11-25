package Animal;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    public String animalSound() {
        return ("The dog "+name+" says: wow wow");
    }
}
