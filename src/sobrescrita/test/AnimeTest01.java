package sobrescrita.test;

import sobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Classrom of the elite");
        anime1.imprimir();
        System.out.println("Anime 1: " + anime1);
    }
}
