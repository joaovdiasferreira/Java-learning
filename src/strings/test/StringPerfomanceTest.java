package strings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        //concatString(100);
        // 100000 -> 2939ms
        // 500000 -> 88570ms

        //concatStringBuilder(500000);
        // 100000 -> 5ms
        // 500000 -> 15ms

        concatStringBuffer(500000);
        // 100000 -> 8ms
        // 500000 -> 19ms

        long fim = System.currentTimeMillis();
        System.out.println("tempo de execução: " + (fim - inicio) + " ms");

    }

    private static void concatString(int length){
        String texto = "";
        for (int i = 0; i < length; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int length){
        StringBuilder texto = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            texto.append(i);
        }
    }

    //USADO EM CONTEXTO DE MULTI-THREAD
    private static void concatStringBuffer(int length){
        StringBuffer texto = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            texto.append(i);
        }
    }

}
