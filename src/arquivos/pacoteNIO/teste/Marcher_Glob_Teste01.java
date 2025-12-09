package arquivos.pacoteNIO.teste;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Marcher_Glob_Teste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\exarquivos\\exemplo.javv");
        Path path2 = Paths.get("C:\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\exarquivos\\exemplo.glob");
        Path path3 = Paths.get("C:\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\devdojo\\exarquivos\\exemploGPT1.txt");

        matcher(path1,"glob:**.javv");
        matcher(path2,"glob:**.{javv,glob,txt}");
        matcher(path3,"glob:**.????");

    }
    private static void matcher(Path path , String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
