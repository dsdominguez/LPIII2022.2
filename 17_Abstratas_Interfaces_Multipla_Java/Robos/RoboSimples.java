package Robos;

public class RoboSimples extends RoboAbstrato {
    RoboSimples(String nome, int px, int py, int dir){
        super(nome, px, py, dir);
    }

    public void move(int passos){
        switch(getDirAtual()){ // recuperamos a direção atual através deste método
            case 0: moveX(+passos); break; // passos positivos na direção X
            case 90: moveY(+passos); break; // passos positivos na direção Y
            case 180: moveX(-passos); break; // passos negativos na direção X
            case 270: moveY(-passos); break; // passos negativos na direção Y
        }
    }
}
