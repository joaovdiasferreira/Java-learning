package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/jvito");
        Path pclass = Paths.get("/home/jvito/projects/HelloWorld.java");
        Path pathRelativized = dir.relativize(pclass);
        System.out.println(pathRelativized);

        Path absolute1 = Paths.get("/home/jvito");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/jvito/projects/HelloWorld.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2026741");

        System.out.println("1 "+ absolute1.relativize(absolute3));
        System.out.println("2 "+ absolute3.relativize(absolute1));
        System.out.println("3 "+ absolute1.relativize(absolute2));
        System.out.println("4 "+ absolute1.relativize(absolute2));
        System.out.println("5 "+ relative1.relativize(relative2));


    }
}
