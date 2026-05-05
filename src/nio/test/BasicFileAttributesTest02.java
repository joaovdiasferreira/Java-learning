package nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/new_test.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last access time: " + lastAccessTime);
        System.out.println("Last modification time: " + lastModifiedTime);
        System.out.println("-------------------");

        FileTime newAccess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicFileAttributeView.setTimes(lastModifiedTime, newAccess, creationTime);

        System.out.println("New access time: " + newAccess);
        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modification time: " + lastModifiedTime);


    }
}
