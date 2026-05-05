package serializacao.test;

import serializacao.dominio.Aluno;
import serializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "Joaozinho","1234");
        Turma turma1 = new Turma("Orientação a objetos");
        aluno1.setTurma(turma1);

        serializar(aluno1);
        //o metodo de deserializar não executa o contrutor do objeto
        deserializar();
    }

    public static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
