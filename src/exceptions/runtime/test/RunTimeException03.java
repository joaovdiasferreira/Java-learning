package exceptions.runtime.test;

public class RunTimeException03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
            //System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //INDEPENDENTE DE RETORNO/EXCEÇÃO ETC, FINALLY É SEMPRE EXECUTADO
            System.out.println("Fechando recursos liberados pelo SO");
        }

        System.out.println("-------------------");
        String retorno = abreConexao();
        System.out.println(retorno);
        System.out.println("-------------------");
        abreConexao2();

    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
        }
        return null;
    }

    public static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
            //TRY-FINALLY É RARO, UTILIZADO EM CASOS ESPECÍFICOS
        }
    }
}
