public class CatWithConstructor{
    private String name;
    private int age;

    public CatWithConstructor(String name, int age){
        this.name = name;
        this.age = (validateAge(age)) ?  age : 0;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    private boolean validateAge(int age){
        if (age>0) 
            return true;
        else
            return false;
    }

    public void setAge(int age) {
        if (validateAge(age)){
            this.age = age;
        }
        else{
            System.out.println("Invalid age!!!");
            this.age = 0;
        }
    }   

    public void info(){
        System.out.println("I am a cat. My name is "+name+
                           " I am "+ age +" years old.");
    }

    public void makeSound(){
        System.out.println("Meow!!!");
    }
}
