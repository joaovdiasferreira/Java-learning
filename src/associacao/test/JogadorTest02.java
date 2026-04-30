package associacao.test;

import associacao.dominio.Jogador;
import associacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador j1 = new Jogador("Raphinha");
        Time t1 = new Time("Barcelona");

        j1.setTime(t1);
        j1.imprimir();
    }
}
