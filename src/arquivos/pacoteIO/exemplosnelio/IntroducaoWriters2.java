package arquivos.pacoteIO.exemplosnelio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IntroducaoWriters2 {
    public static void main(String[] args) {
        File file = new File("arquivo.txt2");
        String[] nome = {"Ola ", "Mundo"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < nome.length; i++) {
                bw.write(nome[i]);
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo" + e.getMessage());
        }

    }
}
