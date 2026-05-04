package io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        //cria apenas o objeto, não o arquivo
        File file = new File("C:\\Users\\jvito\\IdeaProjects\\hello-java02\\filesTest\\test1.txt");

        try {
            //boolean deleted = file.delete();
            //System.out.println("File deleted: " + deleted);
            boolean exists = file.exists();
            System.out.println("File exists: "+exists);

            if (exists) {
                boolean deleted = file.delete();
                System.out.println("File deleted: " + deleted);
            }

            //retorna um boolean
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
            //se executado novamente não é sobrescrito

            System.out.println("path: "+file.getPath());
            System.out.println("path: "+file.getAbsolutePath());
            System.out.println("isDirectory: "+file.isDirectory());
            System.out.println("isFile: "+file.isFile());
            System.out.println("isHidden: "+file.isHidden());

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
