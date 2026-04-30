package introducaometodos.teste;

import introducaometodos.dominio.Estudante;
import introducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImprimeEstudante imprime = new ImprimeEstudante();

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Zoro";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

        imprime.imprimir(estudante01);
        imprime.imprimir(estudante02);
        estudante01.imprimir();
        estudante02.imprimir();

    }
}
