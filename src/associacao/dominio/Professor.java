package associacao.dominio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[]  semanarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] semanarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.semanarios = semanarios;
    }

    public void imprimirRelatorio() {
        System.out.println("Professor: " + this.nome + ", Especialidade: " + this.especialidade);

        if (this.semanarios == null) return;
        System.out.println("Seminarios cadastrados: ");
        for (Seminario seminario : this.semanarios) {
            System.out.println("------------------------------");
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("Alunos: ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getNome());
            }
            System.out.println("------------------------------");
        }
        System.out.println();


    }

    public Seminario[] getSemanarios() {
        return semanarios;
    }

    public void setSemanarios(Seminario[] semanarios) {
        this.semanarios = semanarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
