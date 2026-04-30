package exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivosTest\\test2.txt");

        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " +  isCreated);

        } catch (IOException e) { //Exception é a exceção mais genérica, é melhor pegar as mais específicas
            //NUNCA DEIXAR ESSE BLOCO EM BRANCO
            //EVITAR COLOCAR LÓGICA DE NEGÓCIO NO CATCH
            e.printStackTrace();

        }
    }

}
