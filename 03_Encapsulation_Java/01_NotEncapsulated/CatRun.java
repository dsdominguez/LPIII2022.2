class CatRun{
    String name;
    int age;

    void info(){
        System.out.println("I am a cat. My name is "+name+" I am "+ age +" years old.");
    }

    void makeSound(){
        System.out.println("Meow!!!");
    }

    public static void main(String[] args) {        
        CatRun cat1 = new CatRun();
        cat1.name = "Kayla";
        cat1.age = 2;
        cat1.info();
        CatRun cat2 = new CatRun();
        cat2.name = "Raschid";
        cat2.age = 1;
        cat2.info();
        cat2.makeSound();        
    }
}
