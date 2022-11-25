package Animal;

public class Pig extends Animal{
    Pig(String name){
        super(name);
    }

    @Override
    public String animalSound() {
        return ("The pig "+name+" says: wee wee");
    }
}
