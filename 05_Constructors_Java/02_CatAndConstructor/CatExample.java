public class CatExample {
    public static void main(String[] args) {
        System.out.println("Cat with default constructor.");
        Cat cat3 = new Cat();
        cat3.info();
        cat3.makeSound();

        System.out.println("Cat with custom constructor.");
        CatWithConstructor cat4 = new CatWithConstructor("Kayla", 2);
        cat4.info();
        cat4.makeSound();
        //CatWithConstructor cat5 = new CatWithConstructor();





        /*CatWithConstructor catList[] = new CatWithConstructor[3];
        catList[0] = new CatWithConstructor("Kayla", 2);
        catList[1] = new CatWithConstructor("Raschid", 1);
        catList[2] = new CatWithConstructor("Shoyu", 1);

        for (CatWithConstructor _cat: catList){
            _cat.info();
        }*/
    }    
}
