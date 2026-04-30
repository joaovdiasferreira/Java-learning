package exceptions.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {
        //Capturando múltiplas exceções

        try {
            //NÃO PODEMOS COLOCAR UM TIPO MAIS GENÉRICO À FRENTE DOS MAIS ESPECÍFICOS

            //throw new RuntimeException();
            System.out.println("Dentro do try");

        //SÓ É POSSÍVEL USAR MULTI CATCH COM EXCEÇÕES QUE NÃO SÃO DA MESMA LINHA DE HERANÇA
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException| NullPointerException  e) {
            System.out.println("Dentro do catch com múltiplas exceptions");
        } catch (RuntimeException e) {
            //TODAS AS ANTERIORES SÃO SUBCLASSES DE RUNTIMEEXCEPTION
            System.out.println("Dentro do RuntimeException");
        }

        try {
            lancarExcecao();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void lancarExcecao() throws SQLException, IOException {

    }
}
