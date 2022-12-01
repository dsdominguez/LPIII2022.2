package Robos;

public class RoboComBateria extends RoboAbstrato {
    private int energia;
    static private final int ENERGY_COMSUPTION = 10;

    RoboComBateria(String nome, int px, int py, int dir, int energia){
        super(nome, px, py, dir);
        this.energia = energia;
    }

    public void move(int passos){
        int energiaGasta = passos * ENERGY_COMSUPTION;

        if (energiaGasta <= energia) {
            switch (getDirAtual()) { // recuperamos a direção atual através deste método
                case 0:
                    moveX(+passos);
                    break; // passos positivos na direção X
                case 90:
                    moveY(+passos);
                    break; // passos positivos na direção Y
                case 180:
                    moveX(-passos);
                    break; // passos negativos na direção X
                case 270:
                    moveY(-passos);
                    break; // passos negativos na direção Y
            }
            energia -= energiaGasta;
        }else{
            System.out.println("Robo "+ nomeDoRobo +" sem energia!!!");
        }
    }

    public String toString(){
        String str = super.toString() + "\n";
        str += "Energia: " + energia;

        return str;
    }
}
