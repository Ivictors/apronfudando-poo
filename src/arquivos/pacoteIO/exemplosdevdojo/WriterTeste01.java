package arquivos.pacoteIO.exemplosdevdojo;

import java.io.*;

public class WriterTeste01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\OneDrive\\Documentos\\abc");
        String[] palavras = {"Ola"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < palavras.length; i++) {
                    bw.write(palavras[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
