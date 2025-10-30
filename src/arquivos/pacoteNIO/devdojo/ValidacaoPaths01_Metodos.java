package arquivos.pacoteNIO.devdojo;


import java.nio.file.Path;
import java.nio.file.Paths;

public class ValidacaoPaths01_Metodos {
    public static void main(String[] args) {
        //Normalize
        String path1 = ("estudo/vitu/marques");
        String path2 = ("../../arquivo.txt");
        Path path = Paths.get(path1,path2);

        System.out.println(path);
        System.out.println(path.normalize());

        //resolve
        Path resolve1 = Paths.get("estudo/vitu/marques");
        Path resolve2= Paths.get("arquivo.txt");

        System.out.println(resolve2.resolve(resolve1));

        //relativise
        Path path4 = Paths.get("estudo/vitu/marques");
        Path path5 = Paths.get("arquivo.txt");
        Path relativise = path4.relativize(path5);
        System.out.println(relativise);


    }
}
