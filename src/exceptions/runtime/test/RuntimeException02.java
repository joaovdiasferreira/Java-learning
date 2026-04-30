package exceptions.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        //LANÇANDO EXCEÇÕES UNCHECKED

        try {
            System.out.println("divisão: " + division(1, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Código finalizado");
    }

    private static int division(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Argumento invalido, não pode ser zero");
        }
        return a / b;

/*        try {
            return a / b;
        } catch (ArithmeticException e) { // ou RuntimeException
            e.printStackTrace();
        }
        return 0;*/
    }
}
