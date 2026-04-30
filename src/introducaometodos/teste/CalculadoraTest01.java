package introducaometodos.teste;

import introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        calculadora.somaArray(numeros);
        //calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
