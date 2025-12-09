package arquivos.pacoteNIO.exercicioGPT;

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
        Path arquivosOrigem = Paths.get("src/arquivos/pacoteNIO/devdojo/exarquivos");
        zip(arquivoZip,arquivosOrigem);
    }
    private static void zip(Path arquivoZip, Path arquivosOrigem){
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path>stream = Files.newDirectoryStream(arquivosOrigem)){
            for (Path dir : stream){
                ZipEntry zipEntry = new ZipEntry(dir.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(dir,zipOutputStream);
                zipOutputStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso.");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
