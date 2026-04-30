package associacao.test;

import associacao.dominio.Jogador;
import associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Messi");
        Jogador j2 = new Jogador("Neymar");
        Jogador j3 = new Jogador("Suarez");


        Time t1 = new Time("Barcelona", new Jogador[]{j1,j2, j3});
        t1.imprimir();

        j1.setTime(t1);
        j2.setTime(t1);
        j3.setTime(t1);
        j1.imprimir();
        j2.imprimir();
        j3.imprimir();


    }
}
