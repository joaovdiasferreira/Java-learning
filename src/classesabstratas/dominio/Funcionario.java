package classesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    //UMA SUBCLASSE ABSTRATA NÃO PRECISA IMPLEMENTAR OS MÉTODOS ABSTRATOS DE UMA SUPERCLASSE ABSTRATA
    //OS MÉTODOS ABSTRATOS PRECISAM SER IMPLEMENTADOS PELA SUBCLASSE CONCRETA QUE HERDA DA SUPERCLASSE ABSTRATA

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //SOMENTE CLASSE ABSTRATAS PODEM TER MÉTODOS ABSTRATOS
    public abstract void calculaBonus();
}
