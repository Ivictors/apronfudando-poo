package arquivos.pacoteNIO.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListDir extends SimpleFileVisitor<Path> {

   private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (pathMatcher.matches(file)) System.out.println(file);
        return FileVisitResult.CONTINUE;
    }
}

public class ExercicioGlobTeste01 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListDir());
    }
}
