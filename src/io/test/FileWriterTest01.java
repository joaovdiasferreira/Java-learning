package io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File newFile = new File("C:\\Users\\jvito\\IdeaProjects\\hello-java02\\filesTest\\test2.txt");

        try (FileWriter fw = new FileWriter(newFile,true)){
            fw.write("\nAppending new content");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
