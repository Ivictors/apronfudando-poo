package arquivos.pacoteNIO.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributes_Introducao_Teste01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date =LocalDateTime.now().minusDays(10);

        File file = new File("ArquivoTeste1.txt");
        if(!file.exists()) file.createNewFile();
        boolean lastModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(lastModified);

        Path path = Paths.get("ArquivoTeste2.txt");
        if (Files.notExists(path)) Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Path path1 = Files.setLastModifiedTime(path, fileTime);
    }
}
