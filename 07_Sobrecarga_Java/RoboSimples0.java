public class RoboSimples0 {
    private  String nomeDoRobo;
    private int posicaoXAtual,posicaoYAtual;
    private char direcaoAtual;

    RoboSimples0(String nome, int px, int py, char d){
        //Validação de dados?
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    RoboSimples0(String nome){
        nomeDoRobo = nome;
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N';
    }

    RoboSimples0(){
        nomeDoRobo = "Wally";
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N';
    }

    public void move(){
        if (direcaoAtual == 'N') posicaoYAtual += 1;
        if (direcaoAtual == 'S') posicaoYAtual -= 1;
        if (direcaoAtual == 'E') posicaoXAtual += 1;
        if (direcaoAtual == 'O') posicaoXAtual -= 1;
    }

    public void move(int passos){
        if (direcaoAtual == 'N') posicaoYAtual += passos;
        if (direcaoAtual == 'S') posicaoYAtual -= passos;
        if (direcaoAtual == 'E') posicaoXAtual += passos;
        if (direcaoAtual == 'O') posicaoXAtual -= passos;
    }

    public void mudaDireção(char novaDirecao){
        direcaoAtual = novaDirecao;
    }

    public String toString(){
        String str = "\nNome do robo: "+nomeDoRobo+"\n";
        str = str + "Posicao do robo: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
        str = str + "Direcao do robo: "+direcaoAtual;

        return str;
    }

    //Validação
    //Nome != Null, direcao = {N, S, E, O}

    //Porque não temos método getter e setter nesta classe?
}
