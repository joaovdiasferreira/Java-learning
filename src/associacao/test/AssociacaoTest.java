package associacao.test;

import associacao.dominio.Aluno;
import associacao.dominio.Local;
import associacao.dominio.Professor;
import associacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Campus Uniftec - Caxias do Sul");
        Aluno aluno1 = new Aluno("João",  18);
        Professor professor1 = new Professor("Neiva", "Programação");

        Aluno[] grupoSeminario = {aluno1};

        Seminario seminario1 = new Seminario("Classes em Java", grupoSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario1};

        professor1.setSemanarios(seminariosDisponiveis);

        professor1.imprimirRelatorio();
    }
}
