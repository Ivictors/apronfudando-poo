package arquivos.pacoteIO.exerciciosGPT;

import java.io.*;
import java.util.Scanner;

public class JavaIOTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File file = new File("mensagem.txt");
        String frase = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
            if (!frase.isBlank()) bw.write(frase);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
