package arquivos.pacoteIO.exerciciosGPT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaOperacoesTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File file = new File("C:\\workspace\\estudos.victor\\src\\arquivos","Log.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){

            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Operação a ser realizada");
            String operacao = sc.nextLine();

            bw.write("nome: " + nome);
            bw.newLine();
            bw.write("operação: " + operacao);
            bw.newLine();
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataString = now.format(dtf);
            bw.write("Data e hora da operação: " + dataString);
            bw.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
