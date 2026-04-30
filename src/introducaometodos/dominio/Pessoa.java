package introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    } //Isso é valido, mas feio (NÃO FAÇA)

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0) {
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

}
