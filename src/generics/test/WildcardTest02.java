package generics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(),  new Cachorro());
        List<Gato> gatos = List.of(new Gato(),  new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);
        //erro de compilação
    }
    //TYPE ERASURE
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.consulta();
        }
/*
        ao usar wildcard, o contrato diz que não se pode adicionar itens na lista
        animals.add(new Cachorro());
        animals.add(new Gato());
*/
    }

    private static void printConsultaAnimal(List<? super Animal> animals){
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
