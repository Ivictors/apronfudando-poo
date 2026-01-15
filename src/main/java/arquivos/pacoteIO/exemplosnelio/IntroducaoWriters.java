package arquivos.pacoteIO.exemplosnelio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IntroducaoWriters {
    public static void main(String[] args) {
        File file = new File("arquivo.txt1");
        String [] nome = {"Ola", "Mundo"};

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < nome.length; i++) {
                bw.write(nome[i]);
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo" + e.getMessage());
        } finally {
            try{
                if (fw != null) bw.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
