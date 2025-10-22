package arquivos.pacoteIO.exerciciosGPT;

import java.io.*;

public class BackupTeste {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\workspace\\estudos.victor\\src\\arquivos" , "origem.txt");
        String[] frases = {"Ola mundo"};

        File fileBackup = new File("C:\\workspace\\estudos.victor\\src\\arquivos.pacoteIO.backup");
        fileBackup.mkdir();

        File fileArquivo = new File(fileBackup, "arquivos.pacoteIO.backup.txt");

        FileWriter fileWriter = new FileWriter(fileArquivo,true);

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < frases.length; i++) {
            bw.write(frases[i]);
        }
        bw.write(" Escrevendo para teste");

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String lines;
        while ((lines = br.readLine()) != null){
            System.out.println(lines);
            fileWriter.write(lines );
        }
        fileWriter.close();
        br.close();
    }
}
