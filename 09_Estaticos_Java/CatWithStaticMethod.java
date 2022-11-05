public class CatWithStaticMethod {
    private String name;
    private int age;
    static private int numCats = 0;
    final static private String houseName = "Yellow House";


    public CatWithStaticMethod(String name, int age){
        this.name = name;
        this.age = age;
    }

    static public void makeSound(){
        System.out.println("Meow!!!");
    }

    public void info(){
        System.out.println("\nI am a cat. My name is "+name+" I am "+ age +" years old.");
        System.out.println("I live in the "+houseName+" with "+ numCats +" cats.");
    }
}
