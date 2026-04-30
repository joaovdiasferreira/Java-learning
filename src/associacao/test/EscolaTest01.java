package associacao.test;

import associacao.dominio.Escola;
import associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Jiraya");
        Professor p2 = new Professor("Kakashi");
        Escola escola = new Escola("Academia Ninja", new Professor[]{p1, p2});

        escola.imprimir();

    }
}
