package construtores.test;

import construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Akudama Drive 2", "TV", 12, "Ação", "Production IG");
        //anime1.init("Akudama Drive 2", "TV", 12, "Ação");

        //Anime anime2 = new Anime();

        anime1.imprimir();
        //anime2.imprimir();


    }
}
