package arquivos.pacoteNIO.exercicioGPT;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;


public class ArquivosExtensaoTeste {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**.{txt,pdf,jpg}");

        System.out.println("Entre com o caminho da pasta principal");
        String caminho = input.nextLine();
        Path path1 = Paths.get(caminho);

        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path1);
        for (Path dir : directoryStream) {
            if (dir.toString().endsWith(".txt")) {
                Path path = Paths.get(caminho+".txt");
            }
            if (dir.toString().endsWith(".pdf"));
            if (dir.toString().endsWith(".jpg"));
        }
    }
}
