package arquivos.pacoteNIO.devdojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesView02_Metodos {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime accessTime = basicFileAttributes.lastAccessTime();
        FileTime lastedModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println(fileTime);
        System.out.println(accessTime);
        System.out.println(lastedModifiedTime);

        System.out.println("*");

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fromSO = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastedModifiedTime,accessTime,fromSO);

        fileTime = basicFileAttributeView.readAttributes().creationTime();
        accessTime = basicFileAttributeView.readAttributes().lastAccessTime();
        lastedModifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();


        System.out.println(fileTime);
        System.out.println(accessTime);
        System.out.println(lastedModifiedTime);
    }
}
