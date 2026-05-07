package classesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("walking in the shadows");
            }
            //Esse metodo não exite na classe de origem, portanto nunca poderá ser chamado
            public void makeNoise() {
                System.out.println("make noise");
            }
        };
        animal.walk();
    }
}
