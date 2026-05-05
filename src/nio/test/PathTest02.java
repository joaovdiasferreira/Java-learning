package nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if(Files.notExists(pastaPath)){
        Path pasta = Files.createDirectory(pastaPath);
        }

        Path subPastasPath = Paths.get("pasta/subpasta/subpasta");
        Path subPasta = Files.createDirectories(subPastasPath);

        Path filePath = Paths.get(subPastasPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path file = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target);
    }
}
