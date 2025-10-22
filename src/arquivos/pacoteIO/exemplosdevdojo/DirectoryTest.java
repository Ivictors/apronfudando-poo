package arquivos.pacoteIO.exemplosdevdojo;

import java.io.File;
import java.io.IOException;

public class DirectoryTest {
    public static void main(String[] args)throws IOException{
        File fileDiretorio = new File("C:\\workspace\\estudos.victor\\src\\arquivos\\exemplo1");
        boolean diretorioCreated = fileDiretorio.mkdir();

        File fileDiretorio2 = new File("C:\\workspace\\estudos.victor\\src\\arquivos\\exemplo2");
        boolean isRenamed = fileDiretorio.renameTo(fileDiretorio2);
        System.out.println(isRenamed);

        File fileArquivo = new File(fileDiretorio2,"arquivo.txt");
        boolean newFile = fileArquivo.createNewFile();
        System.out.println(newFile);

        File file2 = new File(fileDiretorio2,"arquivo2");
        fileArquivo.renameTo(file2);
    }
}