package heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }
    {
        System.out.println("Bloco de inicialização de funcionario");
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario){
        super(nome, cpf, endereco);
        System.out.println("Dentro do construtor de funcionario");
        this.salario = salario;
    }
    public Funcionario(double salario){
        //super() fica implicito
        this.salario = salario;
    }
    public Funcionario(){
        super();
    }


    public void imprimir(){
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome + " confirmo que recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
