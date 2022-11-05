public class SimuladorCaixaBancoExample {
    public static void main(String[] args) {
        //Inicializando nossos caixas de banco
        SimuladorCaixaBanco0 c1 = new SimuladorCaixaBanco0(1);
        SimuladorCaixaBanco0 c2 = new SimuladorCaixaBanco0(2);
        SimuladorCaixaBanco0 c3 = new SimuladorCaixaBanco0(3);
        SimuladorCaixaBanco0 c4 = new SimuladorCaixaBanco0(4);
        SimuladorCaixaBanco0 c5 = new SimuladorCaixaBanco0(5);

        //Simulações de atendimento com balanceamento desigual
        c1.iniciaAtendimento();
        c2.iniciaAtendimento();
        c3.iniciaAtendimento();
        c4.iniciaAtendimento();
        c5.iniciaAtendimento();
        System.out.println("");


        c1.iniciaAtendimento();
        c2.iniciaAtendimento();
        c3.iniciaAtendimento();

        c1.iniciaAtendimento();
        c2.iniciaAtendimento();

        c1.iniciaAtendimento();
        c1.iniciaAtendimento();
        c1.iniciaAtendimento();

        System.out.println("");
    }
}
