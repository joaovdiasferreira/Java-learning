package generics.test;

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando doguinho...");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando gatinho...");
    }

}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animals = {new Cachorro(), new Gato()};

        printConsulta(animals);
        System.out.println("-----------");
        printConsulta(gatos);
        printConsulta(cachorros);

    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
        //animals[0] = new Gato();
    }
}
