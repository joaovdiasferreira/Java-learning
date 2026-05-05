package serializacao.dominio;

import java.io.*;

public class Aluno implements Serializable{

    @Serial
    private static final long serialVersionUID = 5670795533914642418L;

    private long id;
    private String nome;
    private transient String password;
    private static final String ESCOLA = "Academia Java";
    private transient Turma turma;

    public Aluno(long id, String nome, String password) {
        System.out.println("dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", escola='" + ESCOLA + '\'' +
                ", turma=" + turma + '\'' +
                '}';
    }


    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            turma = new Turma(ois.readUTF());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
