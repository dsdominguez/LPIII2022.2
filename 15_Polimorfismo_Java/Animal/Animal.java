package Animal;

public class Animal {
    protected String name;

    Animal(String name){
        this.name = name;
    }

    public String animalSound() {
        return "The animal makes a sound";
    }
}
