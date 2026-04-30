package associacao.test;

import associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Messi");
        Jogador j2 = new Jogador("Ronaldo");
        Jogador j3 = new Jogador("Neymar");
        Jogador[] jogadores = new Jogador[]{j1,j2,j3};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }
}
