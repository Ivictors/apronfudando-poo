package arquivos.pacoteNIO.devdojo;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListMetodos extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("PRE VISIT DIR " + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("VISIT FILE " + file.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)  {
        System.out.println("POS VISIT DIR" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }
}
public class SimpleFileVisitor02_Metodos {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo");

        Files.walkFileTree(root, new ListMetodos());
    }
}
