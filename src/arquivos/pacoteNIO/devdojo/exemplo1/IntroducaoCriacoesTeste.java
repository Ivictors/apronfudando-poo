package arquivos.pacoteNIO.devdojo.exemplo1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IntroducaoCriacoesTeste {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("pasta1");
        if (Files.notExists(directory)) {
            Files.createDirectory(directory);
        }

        Path subs = Paths.get("sub1", "sub2", "sub3");
        Files.createDirectories(subs);

        Path path1 = Paths.get(subs.toString(), "arquivo1.txt");
        if (Files.notExists(path1)) {
            Files.createFile(path1);
        }

        Path source = path1;
        Path target = Paths.get(path1.getParent().toString(), "arquivoBackup.txt");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
