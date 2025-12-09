package arquivos.pacoteNIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;


// classe usada somente em ambiente linux configurado.
public abstract class PosixTeste01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\exarquivos\\posix.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());

        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw");
        fileAttributeView.setPermissions(posixFilePermissions);

        System.out.println(fileAttributeView.readAttributes().permissions());
    }
}
