package io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jvito\\IdeaProjects\\hello-java02\\filesTest\\test3.txt");

        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)){

            bw.write("Hello World");
            bw.newLine();
            bw.write("Testando buffer writer");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
