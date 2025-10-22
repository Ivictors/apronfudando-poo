package arquivos.pacoteIO.exemplosnelio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntroducaoReadTWR {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\OneDrive\\Documentos\\Exemplos java.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo " + e.getMessage());
        }
    }
}
