package Robos;

public class RoboComplexo extends RoboSimples{
    RoboComplexo(String nome, int px, int py, int dir){
        super(nome, px, py, dir);
    }

    public void move(int passos){
        switch(getDirAtual()){ // recuperamos a direção atual através deste método
            case 0: case 90: case 180: case 270:
                super.move(passos);
                break;
            case 45:
                moveX(+passos);
                moveY(+passos);
                break;
            case 135:
                moveX(-passos);
                moveY(+passos);
                break;
            case 225:
                moveX(-passos);
                moveY(-passos);
                break;
            case 315:
                moveX(+passos);
                moveY(-passos);
                break;
        }
    }
}
