package genericss.teste;

import genericss.dominio.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        Map <String,Integer> alunos = new HashMap<>();
        alunos.put("Victor",27);
        alunos.put("Larissa",26);
        alunos.put("Heloisa",7);
        alunos.put("Emanuelly",3);

        for (String nome : alunos.keySet()) {
            System.out.println(nome);
        }

        for (Integer idade : alunos.values()){
            System.out.println(idade);
        }

        for (Map.Entry<String,Integer> entry : alunos.entrySet()){
            System.out.println(entry.getKey() + " - " +  entry.getValue());
        }

        List <String> jogadores = new ArrayList<>(List.of("R.Ceni", "Aloisio", "Mineiro"));

        Map<String, List <String>> times = new HashMap<>();
        times.put("São Paulo", jogadores);

        System.out.println(times);

    }
}
