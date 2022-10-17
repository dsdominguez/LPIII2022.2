public class Cat{
    private String name;
    private int age;

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

    public void setAge(int agePar) {
        if (validateAge(agePar)){
            age = agePar;
        }
        else{
            System.out.println("Invalid age!!!");
            age = 0;
        }
    }

    public void setName(String namePar){
        name = namePar;
    }

    public void info(){
        System.out.println("I am a cat. My name is "+name+" I am "+ age +" years old.");
    }

    public void makeSound(){
        System.out.println("Meow!!!");
    }
}
