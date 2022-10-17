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

    public void setAge(int age) {
        if (validateAge(age)){
            this.age = age;
        }
        else{
            System.out.println("Invalid age!!!");
            this.age = 0;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void info(){
        System.out.println("I am a cat. My name is "+name+
                           " I am "+ age +" years old.");
    }

    public void makeSound(){
        System.out.println("Meow!!!");
    }
}
