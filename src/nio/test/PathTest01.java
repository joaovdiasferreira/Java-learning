package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\jvito\\IdeaProjects\\hello-java02\\filesTest\\test3.txt");
        Path p2 = Paths.get("C:\\Users\\jvito\\IdeaProjects\\hello-java02\\filesTest", "test3.txt");
        Path p3 = Paths.get("C:","Users\\jvito\\IdeaProjects\\hello-java02\\filesTest\\", "test3.txt");
        Path p4 = Paths.get("C:", "Users", "jvito", "IdeaProjects", "hello-java02", "filesTest", "test3.txt");
        System.out.println("nome: "+p1.getFileName());
        System.out.println("nome: "+p2.getFileName());
        System.out.println("nome: "+p3.getFileName());
        System.out.println("nome: "+p4.getFileName());
    }
}
