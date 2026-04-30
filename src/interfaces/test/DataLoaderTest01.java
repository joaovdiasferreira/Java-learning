package interfaces.test;

import interfaces.dominio.DataLoader;
import interfaces.dominio.DatabaseLoader;
import interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader dbLoader = new DatabaseLoader();
        dbLoader.load();
        dbLoader.remove();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();

        System.out.println("-------------");

        dbLoader.checkPermission();

        dbLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();

    }
}
