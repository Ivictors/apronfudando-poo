package arquivos.pacoteIO.exemplosnelio;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class IntroducaoFile {
    public static void main(String[] args) {
        Scanner input = null;
        File file = new File("C:\\Users\\victo\\OneDrive\\Documentos\\Exemplos java.txt");
        try {
            input = new Scanner(file);
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
        finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
