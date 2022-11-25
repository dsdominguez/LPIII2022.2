package Animal;

public class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    public String animalSound() {
        return ("The cat "+name+" says: miauu miauu");
    }
}
