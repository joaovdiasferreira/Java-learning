package introducaometodos.teste;

import introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        /*p1.nome = "Pedro";
        p1.idade = -1;*/

        p1.setNome("Pedro");
        p1.setIdade(18);
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
