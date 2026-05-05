package nio.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Path fileZip = Paths.get("pasta/file.zip");
        Path toZip = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(fileZip, toZip);
    }

    private static void zip(Path fileZip, Path toZip) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(toZip)) {
            for (Path path : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(path, zipStream);
                zipStream.closeEntry();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}