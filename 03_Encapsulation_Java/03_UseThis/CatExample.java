public class CatExample {
    public static void main(String[] args) {        
        Cat cat1 = new Cat();
        cat1.setName("Kayla");
        cat1.setAge(2);
        cat1.info();
        cat1.makeSound();
        System.out.println("Cat name:" + cat1.getName());
    }
}
