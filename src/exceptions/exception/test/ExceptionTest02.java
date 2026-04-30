package exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {

        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("código finalizado");
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivosTest\\test2.txt");

        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " +  isCreated);

        } catch (IOException e) { //Exception é a exceção mais genérica, é melhor pegar as mais específicas
            //NUNCA DEIXAR ESSE BLOCO EM BRANCO
            //EVITAR COLOCAR LÓGICA DE NEGÓCIO NO CATCH
            e.printStackTrace();
            throw e;
        }
    }

}
