package exceptions.exception.test;

import exceptions.exception.dominio.Leitor1;
import exceptions.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

        lerArquivoComResources();
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void lerArquivoComResources() {

        // AS CLASSES PRECISAM IMPLEMENTAR CLOSEABLE OU AUTOCLOSE
        // PODE TER MÚLTIPLAS INSTÂNCIAS (SEPARADAS POR ;)
        // OS FECHAMENTOS SÃO NA ORDEM INVERSA DA CHAMADA

        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

            System.out.println("Abrindo arquivos");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
