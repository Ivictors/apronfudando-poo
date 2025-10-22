package arquivos.pacoteNIO.devdojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IntroducaoCriacoes {
    public static void main(String[] args) throws IOException {
        Path pathDirectory1 = Paths.get("C:\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo", "exemplo1");
        if (Files.notExists(pathDirectory1)) {
            Files.createDirectory(pathDirectory1);
        }

        Path subPastas = Paths.get("sub1", "sub2", "sub3");
        Files.createDirectories(subPastas);

        Path pathFile1 = Paths.get(subPastas.toString(), "arquivo.txt1");
        if (Files.notExists(pathFile1)) {
            Files.createFile(pathFile1);
        }

        Path source = pathFile1;
        Path target = Paths.get(pathFile1.getParent().toString(), "arquivoBackup.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
