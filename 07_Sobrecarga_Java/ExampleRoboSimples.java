public class ExampleRoboSimples {
    public static void main(String[] args) {
        RoboSimples groucho = new RoboSimples("Groucho",20,10,'S');
        RoboSimples chico = new RoboSimples("Chico");
        RoboSimples semNome = new RoboSimples();

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
