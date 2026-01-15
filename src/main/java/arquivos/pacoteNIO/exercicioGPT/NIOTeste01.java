package arquivos.pacoteNIO.exercicioGPT;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class extra extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }
}

public class NIOTeste01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\exarquivos\\arquivos1.txt");
        Path dir = Paths.get(".");
        Files.walkFileTree(path, new extra());
        Files.walkFileTree(dir, new extra());
    }
}
