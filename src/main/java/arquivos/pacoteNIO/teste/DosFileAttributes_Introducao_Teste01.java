package arquivos.pacoteNIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributes_Introducao_Teste01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\exarquivos\\teste01.txt");
        if (Files.notExists(path))Files.createFile(path);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);

        System.out.println("Permissões de leitura e alterações");
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dosFileAttributeView.setHidden(true);
        dosFileAttributeView.setReadOnly(true);
    }
}
