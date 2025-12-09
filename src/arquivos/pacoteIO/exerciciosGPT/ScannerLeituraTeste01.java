package arquivos.pacoteIO.exerciciosGPT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerLeituraTeste01 {
    public static void main(String[] args) throws IOException {
        Scanner sc;
        File file = new File("C:\\workspace\\estudos.victor\\src\\backup\\backup.txt");
        sc = new Scanner(file);

        while (sc.hasNext()){
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }
}
