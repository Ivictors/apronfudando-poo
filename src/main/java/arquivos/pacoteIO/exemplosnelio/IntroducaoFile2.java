package arquivos.pacoteIO.exemplosnelio;

import java.io.File;
import java.util.Scanner;

public class IntroducaoFile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o caminho Path");
        File path = new File(input.nextLine());

        File[] diretorios = path.listFiles(File::isDirectory);
        File[] arquivos = path.listFiles(File::isFile);

        try {
            if (diretorios != null && arquivos != null) {
                for (File diretorio : diretorios) {
                    System.out.println(diretorio.getParent());
                    System.out.println(diretorio.getName());
                    System.out.println(diretorio.getAbsolutePath());
                    System.out.println(diretorio.getPath());
                }

                for (File arquivo : arquivos) {
                    System.out.println(arquivo.getName());
                }
            } else throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Entre com um caminho valido não null.");
        }
        input.close();
    }
}
/* System.out.println("Digite o nome do arquivo: ");
        File file = new File(input.nextLine());

        File [] founders = file.listFiles(File :: isDirectory);
        File [] path = file.listFiles(File :: isFile);

        for (File arquivo : path) {
            System.out.println(arquivo.getName());
        }
        for (File arquivo : founders) {
            System.out.println(arquivo.getName());
        }
*/