package colecoes.dominio;

import java.util.Comparator;
import java.util.Objects;


public class Filme implements Comparable<Filme> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Filme(Long id, String nome, double preco) {
        Objects.requireNonNull(id, nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Filme(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Filme o) {
        // -1 se this < o
        // 0 se this = o
        // 1 se this > o

        /*if (this.id < o.id) return -1;
        else if (this.id.equals(o.getId())) return 0;
        else return 1;*/

        return this.nome.compareTo(o.getNome());
        //return Double.compare(this.preco, o.getPreco());
        //return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id) && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
