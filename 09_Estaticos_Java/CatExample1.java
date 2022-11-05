public class CatExample1 {
    public static void main(String[] args) {

        CatWithStaticMethod instanciaCat = new CatWithStaticMethod("Raschid", 1);
        instanciaCat.info();
        instanciaCat.makeSound();

        //Chamando o método sem instanciar objetos
        //CatWithStaticMethod.makeSound();
        //Falha ao chamarmos um metodo non-static usando o nome da classe
        //CatWithStaticMethod.info();
    }
}
