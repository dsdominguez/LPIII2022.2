package Robos;

abstract public class RoboAbstrato {
    protected String nomeDoRobo;
    private int posXAtual, posYAtual;
    private int dirAtual;

    RoboAbstrato(String nome, int px, int py, int dir){
        nomeDoRobo = nome;
        posXAtual = px;
        posYAtual = py;
        dirAtual = dir;
    }

    public void move(){
        move(1);
    }

    public abstract void move(int passos);

    protected void moveX(int passos){
        posXAtual += passos;
    }

    protected void moveY(int passos){
        posYAtual += passos;
    }

    public void mudaDirecao(int novaDirecao){
        dirAtual = novaDirecao;
    }

    public int getDirAtual(){
        return dirAtual;
    }

    public String toString(){
        String str = "Nome do robo: " + nomeDoRobo + "\n";
        str += String.format("Posiçao: (%s, %s)\n", posXAtual, posYAtual);
        str += "Direçao: " + dirAtual;

        return str;
    }
}
