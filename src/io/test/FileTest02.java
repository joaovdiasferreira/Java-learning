package io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("DirectoryTest");

        try {
            if(!file.exists()) {
                boolean isCreatedDir = file.mkdir();
                System.out.println("diretorio criado: "+isCreatedDir);
                System.out.println("isDirectory: "+isCreatedDir);
            }
            if(file.exists()) {
                File fileTest = new File("DirectoryTest", "testfile.txt");
                boolean isCreatedFile = fileTest.createNewFile();
                System.out.println("fileTest criado: "+isCreatedFile);

                File fileRenamed = new File(file, "renamed.txt");
                boolean isRenamed = fileTest.renameTo(fileRenamed);
                System.out.println("file renomeada: "+isRenamed);
            }

        } catch (IOException e) {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }



    }
}
