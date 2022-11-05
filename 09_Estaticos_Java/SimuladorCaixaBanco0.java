public class SimuladorCaixaBanco0 {
    private int numCliente; //número do cliente a ser atendido
    private int numCaixa; //identificador do caixa que faz o atendimento

    SimuladorCaixaBanco0(int n){
        numCaixa = n;
        numCliente = 0;
        System.out.println("Caixa "+numCaixa+" iniciou operaçao.");
    }

    public void iniciaAtendimento(){
        numCliente = numCliente + 1;
        System.out.print("Cliente com a senha número "+numCliente+", favor ");
        System.out.println("dirigir-se ao caixa número "+numCaixa+".");
    }

}
