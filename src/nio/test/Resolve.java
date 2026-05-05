package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Resolve {
    public static void main(String[] args) {
        Path dir = Paths.get("home/jvito");
        Path file = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/jvito");
        Path relative = Paths.get("dev");
        Path file2 = Paths.get("file.txt");
        System.out.println("1 "+ absolute.resolve(relative));
        System.out.println("2 "+ absolute.resolve(file2));
        System.out.println("3 "+ relative.resolve(absolute));
        System.out.println("4 "+ relative.resolve(file));
        System.out.println("5 "+ file.resolve(absolute));
        System.out.println("6 "+ file.resolve(relative));

    }
}
