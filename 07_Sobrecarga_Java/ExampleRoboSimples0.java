public class ExampleRoboSimples0 {
    public static void main(String[] args) {
        RoboSimples0 groucho = new RoboSimples0("Groucho",20,10,'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();

        System.out.println(groucho.toString());
        System.out.println(chico.toString());
        System.out.println(semNome.toString());

        groucho.move(10);
        chico.mudaDireção('E');
        chico.move(5);
        semNome.move();

        System.out.println(groucho.toString());
        System.out.println(chico.toString());
        System.out.println(semNome.toString());
    }
}
