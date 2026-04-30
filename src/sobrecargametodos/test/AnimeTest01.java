package sobrecargametodos.test;

import sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.init("Akudama Drive", "TV", 12);
        anime1.setGenero("Ação");
        anime1.imprimir();

        System.out.println("--------------");

        anime1.init("Akudama Drive 2", "TV", 12, "Ação");
        anime1.imprimir();



    }
}
