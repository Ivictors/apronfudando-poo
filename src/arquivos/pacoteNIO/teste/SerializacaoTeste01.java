package arquivos.pacoteNIO.teste;


import arquivos.pacoteNIO.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTeste01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("J","123456789");
        serializacao(aluno);
        deserializacao();
    }
    private static void serializacao(Aluno aluno){
        Path path = Paths.get("\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\domain\\arquivo");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            outputStream.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializacao(){
        Path path = Paths.get("\\workspace\\estudos.victor\\src\\arquivos\\pacoteNIO\\domain\\arquivo");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Aluno o =(Aluno) objectInputStream.readObject();
            System.out.println(o);
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}