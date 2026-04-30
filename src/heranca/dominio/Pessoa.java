package heranca.dominio;

public class Pessoa {

    // PROTECTED faz a instância poder ser acessadas por classes que herdam dessa classe.
    // MAS OUTRAS CLASSES NO MESMO PACKAGE TAMBÉM VÃO TER ACESSO
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização de pessoa");
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Pessoa(){}

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " " + this.endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
