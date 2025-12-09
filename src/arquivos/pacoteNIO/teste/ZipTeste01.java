package arquivos.pacoteNIO.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ZipTeste01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("arquivo.zip");
        Path arquivosZip = Paths.get("src/arquivos/pacoteNIO/devdojo/exarquivos");
        zip(arquivoZip, arquivosZip);
    }

    private static void zip(Path arquivoZip, Path arquivosZip) {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosZip)) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
