package arquivos.pacoteNIO.devdojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtribbutes01_Modify {
    public static void main(String[] args) throws IOException {
        LocalDateTime data = LocalDateTime.now().minusDays(28);
        Path path = Paths.get("\\Users\\victo\\OneDrive\\Documentos\\exemplo");
        if (Files.notExists(path)) Files.createFile(path);

        FileTime fileTime = FileTime.from(data.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);



    }
}
