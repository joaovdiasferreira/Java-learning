package io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jvito\\IdeaProjects\\hello-java02\\filesTest\\test2.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
