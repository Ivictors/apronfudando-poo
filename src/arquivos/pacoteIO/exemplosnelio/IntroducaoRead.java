package arquivos.pacoteIO.exemplosnelio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntroducaoRead {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\OneDrive\\Documentos\\Exemplos java.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Erro ao abrir o arquivo" + e.getMessage());
        } finally {
            if (br != null) {
                try{
                    fr.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
