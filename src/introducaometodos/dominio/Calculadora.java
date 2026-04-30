package introducaometodos.dominio;

public class Calculadora {
    public void somaArray(int[] array) {
        int soma = 0;
        for (int aux: array) {
            soma += aux;
        }
        System.out.println(soma);

    }

    public void somaVarArgs(int... numeros ) { //varargs precisa ser o último parâmetro
        int soma = 0;
        for (int aux: numeros) {
            soma += aux;
        }
        System.out.println(soma);
    }
}
