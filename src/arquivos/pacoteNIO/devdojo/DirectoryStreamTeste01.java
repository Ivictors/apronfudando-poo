package arquivos.pacoteNIO.devdojo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for(Path p : stream){
                System.out.println(p);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
