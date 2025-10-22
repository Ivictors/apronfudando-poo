package arquivos.pacoteIO.exemplosdevdojo;

import java.io.*;

public class ReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\OneDrive\\Documentos\\abcd");
        String[] palavras = {"Ola", "mundo"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < palavras.length; i++) {
                    bw.write(palavras[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String linhas;
            while ((linhas = br.readLine())!= null){
                System.out.println(linhas);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
